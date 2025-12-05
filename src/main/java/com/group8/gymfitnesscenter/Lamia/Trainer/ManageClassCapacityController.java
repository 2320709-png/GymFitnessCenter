package com.group8.gymfitnesscenter.Lamia.Trainer;

import com.group8.gymfitnesscenter.Lamia.BaseController;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.HashMap;
import java.util.Map;

public class ManageClassCapacityController extends BaseController {

    @FXML private ComboBox<String> classComboBox;
    @FXML private TextField capacityField;
    @FXML private Label statusLabel;

    // Simple storage for classes and capacities
    private final Map<String, Integer> classCapacities = new HashMap<>();

    public void initialize() {

        // Default sample class data
        classCapacities.put("Yoga - Monday 10:00", 12);
        classCapacities.put("Zumba - Wed 4:00 PM", 20);
        classCapacities.put("Pilates - Tuesday 2:00 PM", 15);
        classCapacities.put("Strength Training - Friday 6:00 PM", 18);

        classComboBox.setItems(FXCollections.observableArrayList(classCapacities.keySet()));

        // Update capacity field when class is selected
        classComboBox.setOnAction(e -> updateCapacityField());
    }

    private void updateCapacityField() {
        String selected = classComboBox.getValue();
        if (selected != null) {
            capacityField.setText(String.valueOf(classCapacities.get(selected)));
        }
    }

    @FXML
    private void increaseCapacity() {
        String className = classComboBox.getValue();
        if (className == null) {
            setStatus("Please select a class first.", true);
            return;
        }

        int capacity = classCapacities.get(className);
        capacity++;
        classCapacities.put(className, capacity);
        capacityField.setText(String.valueOf(capacity));
    }

    @FXML
    private void decreaseCapacity() {
        String className = classComboBox.getValue();
        if (className == null) {
            setStatus("Please select a class first.", true);
            return;
        }

        int capacity = classCapacities.get(className);

        if (capacity > 1) {  // prevent negative capacity
            capacity--;
        }

        classCapacities.put(className, capacity);
        capacityField.setText(String.valueOf(capacity));
    }

    @FXML
    private void saveCapacity() {
        String className = classComboBox.getValue();
        if (className == null) {
            setStatus("Select a class before saving.", true);
            return;
        }

        setStatus("Capacity saved for: " + className, false);
    }

    private void setStatus(String message, boolean error) {
        statusLabel.setText(message);
        statusLabel.setStyle(error ? "-fx-text-fill: red;" : "-fx-text-fill: green;");
    }
}
