package com.group8.gymfitnesscenter.Lamia.Trainer;

import com.group8.gymfitnesscenter.Lamia.BaseController;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;

import java.util.ArrayList;
import java.util.List;

public class ApproveDeclineBookingsController extends BaseController {

    @FXML private ListView<String> bookingListView;
    @FXML private Label statusLabel;

    private final List<String> bookingRequests = new ArrayList<>();

    public void initialize() {


        bookingRequests.add("lamia - Yoga Class - Monday 10:00");
        bookingRequests.add("Mahin - Zumba Class - Wednesday 16:00");
        bookingRequests.add("Rafi - Pilates Class - Tuesday 14:00");

        bookingListView.setItems(FXCollections.observableArrayList(bookingRequests));
    }

    @FXML
    private void handleApprove() {
        String selected = bookingListView.getSelectionModel().getSelectedItem();

        if (selected == null) {
            setStatus("Please select a booking to approve.", true);
            return;
        }

        bookingRequests.remove(selected);
        bookingListView.setItems(FXCollections.observableArrayList(bookingRequests));

        setStatus("Approved: " + selected, false);
    }

    @FXML
    private void handleDecline() {
        String selected = bookingListView.getSelectionModel().getSelectedItem();

        if (selected == null) {
            setStatus("Please select a booking to decline.", true);
            return;
        }

        bookingRequests.remove(selected);
        bookingListView.setItems(FXCollections.observableArrayList(bookingRequests));

        setStatus("Declined: " + selected, true);
    }

    private void setStatus(String message, boolean isError) {
        if (isError) {
            statusLabel.setStyle("-fx-text-fill: red;");
        } else {
            statusLabel.setStyle("-fx-text-fill: green;");
        }

        statusLabel.setText(message);
    }
}
