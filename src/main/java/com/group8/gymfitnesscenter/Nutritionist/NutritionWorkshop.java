package com.group8.gymfitnesscenter.Nutritionist;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class NutritionWorkshop
{
    @javafx.fxml.FXML
    private TextArea desciptionTextArea;
    @javafx.fxml.FXML
    private TextField workshopTextField;
    @javafx.fxml.FXML
    private TableColumn<participantdetails,Integer> participantidcolofparticipantdetailsTV;
    @javafx.fxml.FXML
    private TableView<participantdetails> participantsdetailsTV;
    @javafx.fxml.FXML
    private ComboBox<String> clientselectionCB;
    @javafx.fxml.FXML
    private ComboBox<String> trainerselectionCB;
    @javafx.fxml.FXML
    private TextField timeTextField;
    @javafx.fxml.FXML
    private DatePicker selectdateDatePicker;
    @javafx.fxml.FXML
    private TableColumn<participantdetails,String> participantnamecolofparticipantsdetailsTV;

    @javafx.fxml.FXML
    public void initialize() {
        clientselectionCB.getItems().addAll("Client ID","Client name ","Gender");
        trainerselectionCB.getItems().addAll("Trainer ID","Trainer name ","Gender");

        participantidcolofparticipantdetailsTV.setCellValueFactory(new PropertyValueFactory<>("ID"));
        participantnamecolofparticipantsdetailsTV.setCellValueFactory(new PropertyValueFactory<>("Name"));


    }

    @javafx.fxml.FXML
    public void createscheduleOAbutton(ActionEvent actionEvent) {
        workshopTextField.clear();
        timeTextField.clear();
        desciptionTextArea.clear();
    }

    @javafx.fxml.FXML
    public void saveattendanceOAbutton(ActionEvent actionEvent) {
        participantsdetailsTV.getSelectionModel().clearSelection();
    }

    @javafx.fxml.FXML
    public void publishworkshopOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addparticipantOAbutton(ActionEvent actionEvent) {
        clientselectionCB.getSelectionModel().clearSelection();
    }

    @javafx.fxml.FXML
    public void checkavailabilityOAbutton(ActionEvent actionEvent) {
    }
}