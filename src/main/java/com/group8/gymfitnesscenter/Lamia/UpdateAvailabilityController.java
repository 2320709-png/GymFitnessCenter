package com.group8.gymfitnesscenter.Lamia.Trainer;

import com.group8.gymfitnesscenter.Lamia.BaseController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.util.ArrayList;
import java.util.List;

public class UpdateAvailabilityController extends BaseController {

    @FXML private ComboBox<String> dayComboBox;
    @FXML private TextField slotField;
    @FXML private Label statusLabel;
    @FXML private TableView<ScheduleEntry> scheduleTable;
    @FXML private TableColumn<ScheduleEntry, String> nameColumn;
    @FXML private TableColumn<ScheduleEntry, String> dayColumn;
    @FXML private TableColumn<ScheduleEntry, String> slotColumn;


    private final List<ScheduleEntry> scheduleList = new ArrayList<>();
    private final ObservableList<ScheduleEntry> tableData = FXCollections.observableArrayList();

    @FXML
    private void initialize() {

        nameColumn.setCellValueFactory(data -> data.getValue().trainerNameProperty());
        dayColumn.setCellValueFactory(data -> data.getValue().dayProperty());
        slotColumn.setCellValueFactory(data -> data.getValue().timeSlotProperty());

        scheduleTable.setItems(tableData);
    }

    @FXML
    private void handleAddSlot(ActionEvent event) {
        String day = dayComboBox.getValue();
        String slot = slotField.getText();

        if (day == null || day.isEmpty()) {
            statusLabel.setText("Please select a day.");
            return;
        }
        if (slot == null || slot.isEmpty()) {
            statusLabel.setText("Please enter a time slot.");
            return;
        }


        ScheduleEntry entry = new ScheduleEntry("Trainer", day, slot);
        scheduleList.add(entry);


        tableData.setAll(scheduleList);

        slotField.clear();
        statusLabel.setText("Slot added successfully!");
    }


    public static class ScheduleEntry {
        private final javafx.beans.property.SimpleStringProperty trainerName;
        private final javafx.beans.property.SimpleStringProperty day;
        private final javafx.beans.property.SimpleStringProperty timeSlot;

        public ScheduleEntry(String trainerName, String day, String timeSlot) {
            this.trainerName = new javafx.beans.property.SimpleStringProperty(trainerName);
            this.day = new javafx.beans.property.SimpleStringProperty(day);
            this.timeSlot = new javafx.beans.property.SimpleStringProperty(timeSlot);
        }

        public javafx.beans.property.SimpleStringProperty trainerNameProperty() { return trainerName; }
        public javafx.beans.property.SimpleStringProperty dayProperty() { return day; }
        public javafx.beans.property.SimpleStringProperty timeSlotProperty() { return timeSlot; }
    }
}
