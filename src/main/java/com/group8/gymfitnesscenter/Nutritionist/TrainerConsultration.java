package com.group8.gymfitnesscenter.Nutritionist;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

public class TrainerConsultration
{
    @javafx.fxml.FXML
    private TableColumn<clientdietplanTable,Double> quantitycolofclientsdietplanTV;
    @javafx.fxml.FXML
    private TableColumn<clientdietplanTable,String> mealcolofclientsdietplanTV;
    @javafx.fxml.FXML
    private TableColumn<clientdietplanTable,String> notescolofclientsdietplanTV;
    @javafx.fxml.FXML
    private ComboBox<String> clientselectionCB;
    @javafx.fxml.FXML
    private TextArea trainerfeedbackTextArea;
    @javafx.fxml.FXML
    private TableView<clientdietplanTable> clientsdietplanTV;

    @javafx.fxml.FXML
    public void initialize() {
        clientselectionCB.getItems().addAll("Client ID","Client name ","Gender");
        quantitycolofclientsdietplanTV.setCellValueFactory(new PropertyValueFactory<>("Quantity"));
        mealcolofclientsdietplanTV.setCellValueFactory(new PropertyValueFactory<>("Meal "));
        notescolofclientsdietplanTV.setCellValueFactory(new PropertyValueFactory<>("Notes"));


    }

    @javafx.fxml.FXML
    public void savefeedbackvalidityOAbutton(ActionEvent actionEvent) {

        trainerfeedbackTextArea.setPromptText("Feedback validated.");
    }

    @javafx.fxml.FXML
    public void loadplanOAbutton(ActionEvent actionEvent) {

        clientsdietplanTV.getItems().clear();
        trainerfeedbackTextArea.clear();
    }

    @javafx.fxml.FXML
    public void savefeedbackOAbutton(ActionEvent actionEvent) {
        trainerfeedbackTextArea.setPromptText("Feedback saved successfully.");
    }

    @javafx.fxml.FXML
    public void updateplanOAbutton(ActionEvent actionEvent) {
        trainerfeedbackTextArea.setPromptText("Diet plan updated with trainer feedback.");
    }

    @javafx.fxml.FXML
    public void sharewithtrainerOAbutton(ActionEvent actionEvent) {

        trainerfeedbackTextArea.setPromptText("Feedback requested from trainer...");
    }
}