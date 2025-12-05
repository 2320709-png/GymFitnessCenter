package com.group8.gymfitnesscenter.Nutritionist;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

public class DietReminders
{
    @javafx.fxml.FXML
    private TextArea remindermessageTextArea;
    @javafx.fxml.FXML
    private TableView<clientListTable> clientlistTV;
    @javafx.fxml.FXML
    private TableColumn<clientListTable,String> clientnameofclientlistTV;
    @javafx.fxml.FXML
    private DatePicker scheduleDatePicker;
    @javafx.fxml.FXML
    private ComboBox<String>clientselectionCB;
    @javafx.fxml.FXML
    private TableColumn<clientListTable,Integer> clientidofclientlistTV;
    @javafx.fxml.FXML
    private Label statusLabel;

    @javafx.fxml.FXML
    public void initialize() {
        clientselectionCB.getItems().addAll("Client ID","Client name ","Gender");
        clientnameofclientlistTV.setCellValueFactory(new PropertyValueFactory<>("Client name"));
        clientidofclientlistTV.setCellValueFactory(new PropertyValueFactory<>("Client ID"));


    }

    @javafx.fxml.FXML
    public void addtoreminderlistOAbutton(ActionEvent actionEvent) {
        statusLabel.setText("Client added to reminder list.");

    }

    @javafx.fxml.FXML
    public void sendreminderOAbutton(ActionEvent actionEvent) {
        statusLabel.setText("Reminder sent to client(s).");
    }

    @javafx.fxml.FXML
    public void validatescheduleOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void savemessageOAbutton(ActionEvent actionEvent) {
    }
}