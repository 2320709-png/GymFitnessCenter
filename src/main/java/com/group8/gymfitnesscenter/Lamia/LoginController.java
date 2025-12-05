package com.group8.gymfitnesscenter.Lamia.Member;

import com.group8.gymfitnesscenter.Lamia.BaseController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.io.IOException;

public class LoginController extends BaseController {

    @FXML private TextField emailField;
    @FXML private PasswordField passwordField;
    @FXML private Label statusLabel;

    @FXML
    private void handleLogin(ActionEvent actionEvent) throws IOException {

        String email = emailField.getText().trim();
        String pass = passwordField.getText().trim();


        if (email.isEmpty() || pass.isEmpty()) {
            statusLabel.setText("Please enter both email and password.");
            return;
        }


        if (UserData.getEmail() == null) {
            statusLabel.setText("No registered user found. Please register first.");
            return;
        }

        if (!email.equals(UserData.getEmail())) {
            statusLabel.setText("Email not found!");
            return;
        }

        if (!pass.equals(UserData.getPassword())) {
            statusLabel.setText("Incorrect password!");
            return;
        }


        statusLabel.setStyle("-fx-text-fill: green;");
        statusLabel.setText("Login Successful!");


        switchTo(actionEvent, "/com/group8/gymfitnesscenter/memberScreens/MemberDashboard2.fxml");
    }
}
