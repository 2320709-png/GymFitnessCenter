package com.group8.gymfitnesscenter.Lamia.Member;

import com.group8.gymfitnesscenter.Lamia.BaseController;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;


public class EquipmentController extends BaseController {

    // FXML elements
    @FXML
    private TableView<Equipment> equipmentTable;

    @FXML
    private TableColumn<Equipment, String> equipmentColumn;

    @FXML
    private TableColumn<Equipment, String> statusColumn;

    @FXML
    private TableColumn<Equipment, String> timeColumn;

    // ArrayList-style data (converted to ObservableList)
    private ObservableList<Equipment> equipmentList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {

        // Set up table columns
        equipmentColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<>("status"));
        timeColumn.setCellValueFactory(new PropertyValueFactory<>("usageTime"));

        // Sample list (you can replace this with your ArrayList source)
        equipmentList.add(new Equipment("Treadmill", "Available", "0 min"));
        equipmentList.add(new Equipment("Bench Press", "In Use", "12 min"));
        equipmentList.add(new Equipment("Dumbbells", "Available", "0 min"));
        equipmentList.add(new Equipment("Rowing Machine", "In Use", "5 min"));

        equipmentTable.setItems(equipmentList);
    }



    @FXML
    private void startSession() {
        Equipment selected = equipmentTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatus("In Use");
            selected.setUsageTime("0 min");
            equipmentTable.refresh();
        }
    }


    @FXML
    private void endSession() {
        Equipment selected = equipmentTable.getSelectionModel().getSelectedItem();
        if (selected != null) {
            selected.setStatus("Available");
            selected.setUsageTime("Completed");
            equipmentTable.refresh();
        }
    }
}
