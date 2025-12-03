package com.group8.gymfitnesscenter.Receptionist;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

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

    @javafx.fxml.FXML
    public void initialize() {
        trainerCB.getItems().addAll("Name","Id","Gender");
    }

    @javafx.fxml.FXML
    public void publishscheduleOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void savescheduleOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void openscheduleOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void checkavailabilityOAbutton(ActionEvent actionEvent) {
    }
}