package com.group8.gymfitnesscenter.Receptionist;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class ClassScheduleManagement
{
    @javafx.fxml.FXML
    private DatePicker dateDatePicker;
    @javafx.fxml.FXML
    private TableView<ClassScheduleMC> classscheduletableTV;
    @javafx.fxml.FXML
    private TableColumn<ClassScheduleMC,String> classnamecolofclassscheduletableTV;
    @javafx.fxml.FXML
    private TextField startandendtimeTF;
    @javafx.fxml.FXML
    private TableColumn<ClassScheduleMC,String> starttimecolofclassscheduletableTV;
    @javafx.fxml.FXML
    private TableColumn<TrainerAvailabilityScduleMC,String> trainernamecoloftraineravailabilityscheduletableTV;
    @javafx.fxml.FXML
    private TableColumn<TrainerAvailabilityScduleMC,String> availableuntilcoloftraineravailabilityscheduletableTV;
    @javafx.fxml.FXML
    private TextField capacityTF;
    @javafx.fxml.FXML
    private TableColumn<TrainerAvailabilityScduleMC,String> classnamecoloftraineravailabilityscheduletableTV;
    @javafx.fxml.FXML
    private TableColumn<ClassScheduleMC,String> statuscolofclassscheduletableTV;
    @javafx.fxml.FXML
    private TableColumn<ClassScheduleMC,String> trainernamecolofclassscheduletableTV;
    @javafx.fxml.FXML
    private TableColumn<ClassScheduleMC,Integer> capacitycolofclassscheduletableTV;
    @javafx.fxml.FXML
    private TableColumn<TrainerAvailabilityScduleMC,Integer> existingclassescoloftraineravailabilityscheduletableTV;
    @javafx.fxml.FXML
    private TableColumn<ClassScheduleMC, LocalDate> datecolofclassscheduletableTV;
    @javafx.fxml.FXML
    private TableColumn<TrainerAvailabilityScduleMC,LocalDate> datecoloftraineravailabilityscheduletableTV;
    @javafx.fxml.FXML
    private TableColumn<TrainerAvailabilityScduleMC,String> availablefromcoloftraineravailabilityscheduletableTV;
    @javafx.fxml.FXML
    private TextField classnameTF;
    @javafx.fxml.FXML
    private ComboBox<String> trainerCB;
    @javafx.fxml.FXML
    private TableView<TrainerAvailabilityScduleMC> traineravailabilityscheduletableTV;
    @javafx.fxml.FXML
    private TableColumn<ClassScheduleMC,String> endtimecolofclassscheduletableTV;
    @javafx.fxml.FXML
    private TableColumn<TrainerAvailabilityScduleMC,String> availabilitystatuscoloftraineravailabilityscheduletableTV;
    private ObservableList<ClassScheduleMC> classList = FXCollections.observableArrayList();
    @javafx.fxml.FXML
    public void initialize() {
        trainerCB.getItems().addAll("Name","Id","Gender");



        classnamecolofclassscheduletableTV.setCellValueFactory(new PropertyValueFactory<>("Class Name "));
        trainernamecolofclassscheduletableTV.setCellValueFactory(new PropertyValueFactory<>("Trainer Name"));
        datecolofclassscheduletableTV.setCellValueFactory(new PropertyValueFactory<>("Date"));
        starttimecolofclassscheduletableTV.setCellValueFactory(new PropertyValueFactory<>("Start Time"));
        endtimecolofclassscheduletableTV.setCellValueFactory(new PropertyValueFactory<>("End Time"));
        capacitycolofclassscheduletableTV.setCellValueFactory(new PropertyValueFactory<>("Capacity"));
        statuscolofclassscheduletableTV.setCellValueFactory(new PropertyValueFactory<>("Status"));
        classnamecoloftraineravailabilityscheduletableTV.setCellValueFactory(new PropertyValueFactory<>("Class Name "));
        trainernamecoloftraineravailabilityscheduletableTV.setCellValueFactory(new PropertyValueFactory<>("Trainer Name"));
        availablefromcoloftraineravailabilityscheduletableTV.setCellValueFactory(new PropertyValueFactory<>("Available From"));
        availableuntilcoloftraineravailabilityscheduletableTV.setCellValueFactory(new PropertyValueFactory<>("Available util"));
        existingclassescoloftraineravailabilityscheduletableTV.setCellValueFactory(new PropertyValueFactory<>("Existing status"));
        availabilitystatuscoloftraineravailabilityscheduletableTV.setCellValueFactory(new PropertyValueFactory<>("Availability status"));
        datecoloftraineravailabilityscheduletableTV.setCellValueFactory(new PropertyValueFactory<>("Date "));

        classscheduletableTV.setItems(classList);


    }

    @javafx.fxml.FXML
    public void publishscheduleOAbutton(ActionEvent actionEvent) {

        for (ClassScheduleMC cls : classList) {
            cls.setStatus("Published");
        }
        classscheduletableTV.refresh();
    }

    @javafx.fxml.FXML
    public void savescheduleOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void openscheduleOAbutton(ActionEvent actionEvent) {

        classList.add(new ClassScheduleMC(
                classnameTF.getText(),
                trainerCB.getValue(),
                dateDatePicker.getValue(),
                startandendtimeTF.getText(),
                startandendtimeTF.getText(),
                Integer.parseInt(capacityTF.getText()),
                "Open"
        ));
        // Clear fields
        classnameTF.clear();
        startandendtimeTF.clear();
        capacityTF.clear();
        trainerCB.setValue(null);
        dateDatePicker.setValue(null);
    }

    @javafx.fxml.FXML
    public void checkavailabilityOAbutton(ActionEvent actionEvent) {

        for (ClassScheduleMC cls : classList) {
            cls.setStatus("Available");
        }
        classscheduletableTV.refresh();
    }
}