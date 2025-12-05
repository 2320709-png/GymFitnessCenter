package com.group8.gymfitnesscenter.Nutritionist;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class HealthAlerts
{
    @javafx.fxml.FXML
    private ComboBox<String> clientselectionCB;
    @javafx.fxml.FXML
    private TableColumn<clientwithallergyproblemprofileTable, LocalDate> dateaddedcolofclientwithallergyproblemprofileTV;
    @javafx.fxml.FXML
    private TextArea descriptionTextArea;
    @javafx.fxml.FXML
    private TableColumn<clientwithallergyproblemprofileTable,String> allergycolofclientwithallergyproblemprofileTV;
    @javafx.fxml.FXML
    private TableColumn<clientwithallergyproblemprofileTable,String> descriptioncolofclientwithallergyproblemprofileTV;
    @javafx.fxml.FXML
    private TextField allergynameTextField;
    @javafx.fxml.FXML
    private TableView<clientwithallergyproblemprofileTable> clientwithallergyproblemprofileTV;

    @javafx.fxml.FXML
    public void initialize() {
        clientselectionCB.getItems().addAll("Client ID","Client name ","Gender");

        dateaddedcolofclientwithallergyproblemprofileTV.setCellValueFactory(new PropertyValueFactory<>("Date Added"));
        allergycolofclientwithallergyproblemprofileTV.setCellValueFactory(new PropertyValueFactory<>("Allergy"));
        descriptioncolofclientwithallergyproblemprofileTV.setCellValueFactory(new PropertyValueFactory<>("description"));
    }

    @javafx.fxml.FXML
    public void saveregistrationOAbutton(ActionEvent actionEvent) {

    }

    @javafx.fxml.FXML
    public void loadprofileOAbutton(ActionEvent actionEvent) {
        clientwithallergyproblemprofileTV.getItems().clear();
    }

    @javafx.fxml.FXML
    public void addallergyOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void allergyvalidationOAbutton(ActionEvent actionEvent) {
    }
}