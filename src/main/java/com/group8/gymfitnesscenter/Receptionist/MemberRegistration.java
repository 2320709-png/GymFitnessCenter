package com.group8.gymfitnesscenter.Receptionist;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MemberRegistration
{
    @javafx.fxml.FXML
    private DatePicker birthdateDatePicker;
    @javafx.fxml.FXML
    private TextField addressTextField;
    @javafx.fxml.FXML
    private TextField phoneTextField;
    @javafx.fxml.FXML
    private ComboBox<String> genderCB;
    @javafx.fxml.FXML
    private ComboBox<String> planCB;
    @javafx.fxml.FXML
    private TextField nameTextField;
    @javafx.fxml.FXML
    private Label validationLabel;
    @javafx.fxml.FXML
    private Label planValidationLabel;

    @javafx.fxml.FXML
    public void initialize() {
        genderCB.getItems().addAll("Male","Female");
        planCB.getItems().addAll("Regular","Special","Custom plan","others");
    }

    @javafx.fxml.FXML
    public void saveprofileOAbutton(ActionEvent actionEvent) {

        if(nameTextField.getText().isEmpty() || phoneTextField.getText().isEmpty() ||
                addressTextField.getText().isEmpty() || birthdateDatePicker.getValue() == null ||
                genderCB.getValue() == null) {
            validationLabel.setText("Please fill in all required personal details.");
            planValidationLabel.setText("plan valid/Not valid");
            return;
        } else {
            validationLabel.setText("Member profile saved successfully!");
    }




    }

    @javafx.fxml.FXML
    public void registrationformOAbutton(ActionEvent actionEvent) {
        validationLabel.setText("Registration form loaded successfully");
    }

    @javafx.fxml.FXML
    public void generateidcardOAbutton(ActionEvent actionEvent) {

        if(nameTextField.getText().isEmpty()) {
            validationLabel.setText("Save profile first!");
            return;
        }

    }
}