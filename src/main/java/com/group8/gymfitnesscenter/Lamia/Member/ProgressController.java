package com.group8.gymfitnesscenter.Lamia.Member;

import com.group8.gymfitnesscenter.Lamia.BaseController;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;


public class ProgressController extends BaseController {

    @FXML
    private PieChart progressPieChart;

    @FXML
    private TextField cardioInput;

    @FXML
    private TextField strengthInput;

    @FXML
    private TextField flexibilityInput;

    @FXML
    private void generatePieChart() {
        try {
            double cardio = Double.parseDouble(cardioInput.getText());
            double strength = Double.parseDouble(strengthInput.getText());
            double flexibility = Double.parseDouble(flexibilityInput.getText());

            progressPieChart.getData().clear(); // reset old data

            progressPieChart.getData().add(new PieChart.Data("Cardio", cardio));
            progressPieChart.getData().add(new PieChart.Data("Strength", strength));
            progressPieChart.getData().add(new PieChart.Data("Flexibility", flexibility));

        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Please enter valid numbers!", ButtonType.OK);
            alert.showAndWait();
        }
    }

}
