package com.group8.gymfitnesscenter.Receptionist;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.text.BreakIterator;

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

        // Check Payment Method
        if (paymentmethodCB.getValue() == null) {
            verificationLabel.setText("Select payment method.");
            return;
        }

        // Check Transaction ID
        if (transactionTextField.getText().isEmpty()) {
            verificationLabel.setText("Enter transaction ID.");
            return;
        }

        // Check Amount
        if (amountTextField.getText().isEmpty()) {
            verificationLabel.setText("Enter amount.");
            return;
        }

        // All good → process payment
        verificationLabel.setText("Payment processed successfully.");
    }

    @javafx.fxml.FXML
    public void generatereceiptOAbutton(ActionEvent actionEvent) {

        BreakIterator verificationLabel;
        if (amountTextField.getText().isEmpty() || transactionTextField.getText().isEmpty()) {
            verificationLabel.setText("Payment required before generating receipt.");
            return;
        }

        verificationLabel.setText("Receipt generated.");
    }

    @javafx.fxml.FXML
    public void searchOAbutton(ActionEvent actionEvent) {

        if (memberidTextField.getText().isEmpty()) {
            verificationLabel.setText("Enter member ID.");
            return;
        }

        verificationLabel.setText("Member profile loaded.");
    }
}