package com.group8.gymfitnesscenter.Lamia.Member;

import com.group8.gymfitnesscenter.Lamia.BaseController;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;

public class ProfileController extends BaseController
{
    @javafx.fxml.FXML
    private TextField ageField;
    @javafx.fxml.FXML
    private TextField nameField;
    @javafx.fxml.FXML
    private TextField weightField;

    @javafx.fxml.FXML
    public void initialize() {
    }




    @javafx.fxml.FXML
    public void saveProfile(ActionEvent actionEvent) {
        UserData.setName(nameField.getText());
        UserData.setAge(Integer.parseInt(ageField.getText()));
        UserData.setWeight(Double.parseDouble(weightField.getText()));



        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Profile Saved");
        alert.setHeaderText(null);
        alert.setContentText("Your profile has been updated successfully!");
        alert.showAndWait();
    }
}
