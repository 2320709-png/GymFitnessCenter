package com.group8.gymfitnesscenter.Receptionist;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

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
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void savereportOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void exportexcelOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void sendtomanagerOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void exportpdfOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void openattendancesystemOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void fetchrecordsOAbutton(ActionEvent actionEvent) {
    }
}