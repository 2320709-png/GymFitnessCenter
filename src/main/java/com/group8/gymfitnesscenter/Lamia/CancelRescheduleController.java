package com.group8.gymfitnesscenter.Lamia.Trainer;

import com.group8.gymfitnesscenter.Lamia.BaseController;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.List;

public class CancelRescheduleController extends BaseController {

    @FXML private ComboBox<String> classComboBox;
    @FXML private ComboBox<String> actionComboBox;
    @FXML private TextField newDateTimeField;
    @FXML private Label statusLabel;


    private final List<String> classList = new ArrayList<>();

    public void initialize() {

        classList.add("Yoga - Monday 10:00");
        classList.add("Pilates - Tuesday 14:00");
        classList.add("Zumba - Wednesday 16:00");

        classComboBox.setItems(FXCollections.observableArrayList(classList));
    }

    @FXML
    private void handleApplyChanges() {
        String selectedClass = classComboBox.getValue();
        String action = actionComboBox.getValue();
        String newDateTime = newDateTimeField.getText();

        if(selectedClass == null || selectedClass.isEmpty()) {
            statusLabel.setStyle("-fx-text-fill: red;");
            statusLabel.setText("Please select a class.");
            return;
        }

        if(action == null || action.isEmpty()) {
            statusLabel.setStyle("-fx-text-fill: red;");
            statusLabel.setText("Please select an action.");
            return;
        }

        if(action.equals("Reschedule") && (newDateTime == null || newDateTime.isEmpty())) {
            statusLabel.setStyle("-fx-text-fill: red;");
            statusLabel.setText("Please provide new date/time for rescheduling.");
            return;
        }


        if(action.equals("Cancel")) {
            classList.remove(selectedClass);
            classComboBox.setItems(FXCollections.observableArrayList(classList));
            statusLabel.setStyle("-fx-text-fill: green;");
            statusLabel.setText(selectedClass + " has been canceled.");
        } else if(action.equals("Reschedule")) {
            int index = classList.indexOf(selectedClass);
            classList.set(index, newDateTime);
            classComboBox.setItems(FXCollections.observableArrayList(classList));
            statusLabel.setStyle("-fx-text-fill: green;");
            statusLabel.setText(selectedClass + " has been rescheduled to " + newDateTime);
        }


        actionComboBox.setValue(null);
        newDateTimeField.clear();
    }
}
