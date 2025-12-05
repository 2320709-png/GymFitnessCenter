package com.group8.gymfitnesscenter.Lamia.Member;

import com.group8.gymfitnesscenter.Lamia.BaseController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;

public class CancelBookingController extends BaseController {

    @FXML
    private ListView<String> bookingList;

    @FXML
    public void initialize() {
        refreshList();
    }

    private void refreshList() {
        ObservableList<String> list =
                FXCollections.observableArrayList(BookingManager.getBookings());

        bookingList.setItems(list);
    }

    @FXML
    private void cancelSelected() {
        String selected = bookingList.getSelectionModel().getSelectedItem();

        if (selected == null) {
            showAlert("Error", "Please select a booking to cancel.");
            return;
        }

        BookingManager.removeBooking(selected);
        refreshList();

        showAlert("Success", "Cancelled: " + selected);
    }


    private void showAlert(String title, String msg) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(msg);
        alert.show();
    }
}
