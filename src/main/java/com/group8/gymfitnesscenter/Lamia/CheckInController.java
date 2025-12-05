package com.group8.gymfitnesscenter.Lamia.Member;

import com.group8.gymfitnesscenter.Lamia.BaseController;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class CheckInController extends BaseController {

    @FXML
    private Label lastCheckinLabel;

    @FXML
    public void initialize() {
        updateLabel();
    }

    private void updateLabel() {
        LocalDate last = UserData.getLastCheckIn();

        if (last == null) {
            lastCheckinLabel.setText("Last check-in: Never");
        } else {
            long days = ChronoUnit.DAYS.between(last, LocalDate.now());
            lastCheckinLabel.setText("Last check-in: " + days + " days ago");
        }
    }

    @FXML
    private void checkInNow() {
        UserData.setLastCheckIn(LocalDate.now());

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Checked In");
        alert.setHeaderText(null);
        alert.setContentText("You have successfully checked in!");
        alert.showAndWait();

        updateLabel();
    }
}
