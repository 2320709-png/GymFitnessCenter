package com.group8.gymfitnesscenter.Lamia.Trainer;

import com.group8.gymfitnesscenter.Lamia.BaseController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class ConductSessionController extends BaseController {

    @FXML private TableView<SessionEntry> sessionTable;
    @FXML private TableColumn<SessionEntry, String> memberColumn;
    @FXML private TableColumn<SessionEntry, String> dayColumn;
    @FXML private TableColumn<SessionEntry, String> slotColumn;
    @FXML private TableColumn<SessionEntry, Boolean> attendanceColumn;
    @FXML private Label statusLabel;

    private ObservableList<SessionEntry> sessionList = FXCollections.observableArrayList();

    public void initialize() {
        sessionList.addAll(
                new SessionEntry("Lamia", "Monday", "10:00-11:00"),
                new SessionEntry("Anika", "Monday", "11:00-12:00")
        );

        memberColumn.setCellValueFactory(cellData -> cellData.getValue().memberNameProperty());
        dayColumn.setCellValueFactory(cellData -> cellData.getValue().dayProperty());
        slotColumn.setCellValueFactory(cellData -> cellData.getValue().timeSlotProperty());
        attendanceColumn.setCellValueFactory(cellData -> cellData.getValue().attendedProperty());

        sessionTable.setItems(sessionList);
    }

    @FXML
    private void handleMarkAttendance() {
        SessionEntry selected = sessionTable.getSelectionModel().getSelectedItem();
        if(selected == null) {
            statusLabel.setStyle("-fx-text-fill: red;");
            statusLabel.setText("Select a session to mark attendance!");
            return;
        }
        selected.setAttended(true);
        sessionTable.refresh();
        statusLabel.setStyle("-fx-text-fill: green;");
        statusLabel.setText("Attendance marked for " + selected.getMemberName());
    }

    @FXML
    private void handleCompleteSession() {
        SessionEntry selected = sessionTable.getSelectionModel().getSelectedItem();
        if(selected == null) {
            statusLabel.setStyle("-fx-text-fill: red;");
            statusLabel.setText("Select a session to complete!");
            return;
        }
        if(!selected.isAttended()) {
            statusLabel.setStyle("-fx-text-fill: red;");
            statusLabel.setText("Cannot complete session. Attendance not marked!");
            return;
        }
        statusLabel.setStyle("-fx-text-fill: green;");
        statusLabel.setText("Session completed for " + selected.getMemberName());

    }
}
