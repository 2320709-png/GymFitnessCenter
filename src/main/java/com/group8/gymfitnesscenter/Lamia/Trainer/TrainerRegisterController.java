package com.group8.gymfitnesscenter.Lamia.Trainer;

import com.group8.gymfitnesscenter.Lamia.BaseController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class TrainerRegisterController extends BaseController {

    @FXML private TextField nameField;
    @FXML private TextField emailField;
    @FXML private TextField phoneField;
    @FXML private TextField qualificationField;
    @FXML private PasswordField passwordField;
    @FXML private Label statusLabel;


    @FXML
    private void handleApply(ActionEvent event) throws IOException {
        String name = nameField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();
        String qualification = qualificationField.getText();
        String password = passwordField.getText();


        if (name == null || name.isEmpty()) {
            statusLabel.setText("Please enter your name.");
            return;
        }
        if (email == null || !email.contains("@")) {
            statusLabel.setText("Please enter a valid email.");
            return;
        }
        if (qualification == null || qualification.isEmpty()) {
            statusLabel.setText("Please provide qualification details.");
            return;
        }
        if (password == null || password.isEmpty()) {
            statusLabel.setText("Please enter a password.");
            return;
        }


        TrainerData.setName(name);
        TrainerData.setEmail(email);
        TrainerData.setPhone(phone);
        TrainerData.setQualification(qualification);
        TrainerData.setPassword(password);

        boolean saved = TrainerData.saveProfile();
        if (saved) {
            statusLabel.setStyle("-fx-text-fill: green;");
            statusLabel.setText("Application submitted. Trainer ID: " + TrainerData.getTrainerID());
        } else {
            statusLabel.setStyle("-fx-text-fill: red;");
            statusLabel.setText("Error saving profile. Please try again.");
        }

        switchTo(event, "/com/group8/gymfitnesscenter/trainerScreens/TrainerLogin.fxml");
    }
}
