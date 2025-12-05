package com.group8.gymfitnesscenter.Lamia.Member;

import com.group8.gymfitnesscenter.Lamia.BaseController;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;

public class BookClassController extends BaseController {

    @FXML
    private ComboBox<String> classCombo;

    @FXML
    private ComboBox<String> timeCombo;

    @FXML
    private void bookClass() {
        String gymClass = classCombo.getValue();
        String time     = timeCombo.getValue();

        if (gymClass == null || time == null) {
            showAlert("Error", "Please select both class and time.");
            return;
        }

        String booking = gymClass + " - " + time;

        // Store into shared arraylist
        BookingManager.addBooking(booking);

        showAlert("Success", "Booked: " + booking);
    }

    private void showAlert(String title, String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle(title);
        alert.setContentText(msg);
        alert.show();
    }
}
