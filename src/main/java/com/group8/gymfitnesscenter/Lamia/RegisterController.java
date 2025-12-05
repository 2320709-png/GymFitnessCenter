package com.group8.gymfitnesscenter.Lamia.Member;

import com.group8.gymfitnesscenter.Lamia.BaseController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;



public class RegisterController extends BaseController {

    @FXML private TextField nameField;
    @FXML private TextField ageField;
    @FXML private TextField weightField;
    @FXML private TextField emailField;
    @FXML private TextField phoneField;
    @FXML private PasswordField passwordField;
    @FXML private ComboBox<String> membershipBox;
    @FXML private Label statusLabel;

    @FXML
    private void handleRegister(ActionEvent actionEvent) {

        try {
            UserData.setName(nameField.getText());
            UserData.setAge(Integer.parseInt(ageField.getText()));
            UserData.setWeight(Double.parseDouble(weightField.getText()));
            UserData.setEmail(emailField.getText());
            UserData.setPhone(phoneField.getText());
            UserData.setPassword(passwordField.getText());
            UserData.setMembership(membershipBox.getValue());

            if (!UserData.isValid()) {
                statusLabel.setText("Invalid input! Please fill correctly.");
                return;
            }

            if (UserData.saveProfile()) {
                statusLabel.setStyle("-fx-text-fill: green;");
                statusLabel.setText("Registration Successful! Member ID: " + UserData.getMemberID());

                switchTo(actionEvent, "/com/group8/gymfitnesscenter/memberScreens/Login.fxml");

            }

        } catch (Exception e) {
            statusLabel.setText("Error: Please enter valid numbers.");
        }


    }
}
