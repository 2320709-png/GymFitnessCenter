package com.group8.gymfitnesscenter.Receptionist;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class AttendanceCheck
{
    @javafx.fxml.FXML
    private TextField memberidTF;
    @javafx.fxml.FXML
    private TableColumn<AttendanceRecordMC,Integer> phonecolofattendancerecordtableTv;
    @javafx.fxml.FXML
    private TableColumn<AttendanceRecordMC,String> membernamecolofattendancerecordtableTv;
    @javafx.fxml.FXML
    private TableColumn<AttendanceRecordMC,LocalDate> expirydatecolofattendancerecordtableTv;
    @javafx.fxml.FXML
    private TableColumn<AttendanceRecordMC,String> lastcheckoutcolofattendancerecordtableTv;
    @javafx.fxml.FXML
    private TableColumn<AttendanceRecordMC,Integer> memberidcolofattendancerecordtableTv;
    @javafx.fxml.FXML
    private TableColumn<AttendanceRecordMC, LocalDate> startdatecolofattendancerecordtableTv;
    @javafx.fxml.FXML
    private TableColumn<AttendanceRecordMC,Integer> recordidcolofattendancerecordtableTv;
    @javafx.fxml.FXML
    private TableView<AttendanceRecordMC> attendancerecordtableTv;
    @javafx.fxml.FXML
    private TableColumn<AttendanceRecordMC,String> lastcheckincolofattendancerecordtableTv;
    @javafx.fxml.FXML
    private TableColumn<AttendanceRecordMC,String> processedbycolofattendancerecordtableTv;

    @javafx.fxml.FXML
    public void initialize() {

    }

    @javafx.fxml.FXML
    public void scanOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void checkoutOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void checkinOAbutton(ActionEvent actionEvent) {
    }
}