package com.group8.gymfitnesscenter.Receptionist;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class DailyAttendanceReports
{
    @javafx.fxml.FXML
    private TableColumn<AttendanceSheetMC,String> checkintimecolofattendancesheetTV;
    @javafx.fxml.FXML
    private TableColumn<AttendanceSheetMC,String> membernamecolofattendancesheetTV;
    @javafx.fxml.FXML
    private TableView<AttendanceSheetMC> attendancesheetTV;
    @javafx.fxml.FXML
    private TableColumn<AttendanceSheetMC,Integer> memberidcolofattendancesheetTV;
    @javafx.fxml.FXML
    private TableColumn<AttendanceSheetMC,String> totaldurationcolofattendancesheetTV;
    @javafx.fxml.FXML
    private TableColumn<AttendanceSheetMC,Integer> recordidcolofattendancesheetTV;
    @javafx.fxml.FXML
    private TableColumn<AttendanceSheetMC,String> checkouttimecolofattendancesheetTV;
    @javafx.fxml.FXML
    private TableColumn<AttendanceSheetMC, LocalDate> datecolofattendancesheetTV;
    @javafx.fxml.FXML
    private TableColumn<AttendanceSheetMC,String> processedbycolofattendancesheetTV;
    @javafx.fxml.FXML
    private Label validationStatusLabel;

    @javafx.fxml.FXML
    public void initialize() {
        checkintimecolofattendancesheetTV.setCellValueFactory(new PropertyValueFactory<>("Check in time "));
        membernamecolofattendancesheetTV.setCellValueFactory(new PropertyValueFactory<>("Member Name"));
        memberidcolofattendancesheetTV.setCellValueFactory(new PropertyValueFactory<>("Member ID"));
        recordidcolofattendancesheetTV.setCellValueFactory(new PropertyValueFactory<>("Record ID"));
        totaldurationcolofattendancesheetTV.setCellValueFactory(new PropertyValueFactory<>("Total Duration"));
        checkouttimecolofattendancesheetTV.setCellValueFactory(new PropertyValueFactory<>("Check Out"));
        datecolofattendancesheetTV.setCellValueFactory(new PropertyValueFactory<>("Date"));
        processedbycolofattendancesheetTV.setCellValueFactory(new PropertyValueFactory<>("Processed By"));
    }

    @javafx.fxml.FXML
    public void savereportOAbutton(ActionEvent actionEvent) {
        validationStatusLabel.setText("Report saved and sent.");
    }

    @javafx.fxml.FXML
    public void exportexcelOAbutton(ActionEvent actionEvent) {
        validationStatusLabel.setText("Report exported.");
    }

    @javafx.fxml.FXML
    public void sendtomanagerOAbutton(ActionEvent actionEvent) {

        validationStatusLabel.setText("Report saved and sent.");
    }

    @javafx.fxml.FXML
    public void exportpdfOAbutton(ActionEvent actionEvent) {
        validationStatusLabel.setText("Report exported.");

    }

    @javafx.fxml.FXML
    public void openattendancesystemOAbutton(ActionEvent actionEvent) {

        validationStatusLabel.setText("Attendance system loaded.");
    }

    @javafx.fxml.FXML
    public void fetchrecordsOAbutton(ActionEvent actionEvent) {

        validationStatusLabel.setText("Records fetched.");
    }
}