package com.group8.gymfitnesscenter.Receptionist;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class MembershipsPayment
{
    @javafx.fxml.FXML
    private TextField amountTextField;
    @javafx.fxml.FXML
    private TextField memberidTextField;
    @javafx.fxml.FXML
    private TextField transactionTextField;
    @javafx.fxml.FXML
    private ComboBox<String> paymentmethodCB;

    @javafx.fxml.FXML
    public void initialize() {
        paymentmethodCB.getItems().addAll("Credit card","Cash","others");
    }

    @javafx.fxml.FXML
    public void processpaymentOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void generatereceiptOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void searchOAbutton(ActionEvent actionEvent) {
    }
}