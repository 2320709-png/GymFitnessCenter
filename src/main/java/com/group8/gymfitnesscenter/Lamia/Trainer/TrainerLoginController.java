package com.group8.gymfitnesscenter.Lamia.Trainer;

import com.group8.gymfitnesscenter.Lamia.BaseController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class TrainerLoginController extends BaseController {

    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;
    @FXML private Label statusLabel;

    @FXML
    public void handleLogin(ActionEvent actionEvent) throws IOException {
        String email = emailField.getText().trim();
        String password = passwordField.getText().trim();

        if (email.isEmpty() || password.isEmpty()) {
            statusLabel.setText("Please fill all fields.");
            return;
        }

        if (email.equals(TrainerData.getEmail()) &&
                password.equals(TrainerData.getPassword())) {

            statusLabel.setText("");
            switchTo(actionEvent, "/com/group8/gymfitnesscenter/trainerScreens/TrainerDashboard.fxml");
        } else {
            statusLabel.setText("Invalid email or password.");
        }
    }

    }

