package com.group8.gymfitnesscenter.Receptionist;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

import java.time.LocalDate;
import java.time.LocalTime;

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
    private Label memberidscannedlabel;
    @javafx.fxml.FXML
    private Label currenttimelabel;
    @javafx.fxml.FXML
    private Label checkoutstatuslabel;
    @javafx.fxml.FXML
    private AnchorPane entermemberidlabel;
    @javafx.fxml.FXML
    private Label checkinstatuslabel;

    @javafx.fxml.FXML
    public void initialize() {

        recordidcolofattendancerecordtableTv.setCellValueFactory(new PropertyValueFactory<>("Record ID "));
        membernamecolofattendancerecordtableTv.setCellValueFactory(new PropertyValueFactory<>("Member Name"));
        memberidcolofattendancerecordtableTv.setCellValueFactory(new PropertyValueFactory<>("Member ID"));
        phonecolofattendancerecordtableTv.setCellValueFactory(new PropertyValueFactory<>("Phone"));
        startdatecolofattendancerecordtableTv.setCellValueFactory(new PropertyValueFactory<>("Start Date"));
        expirydatecolofattendancerecordtableTv.setCellValueFactory(new PropertyValueFactory<>("Expiry Date "));
        lastcheckincolofattendancerecordtableTv.setCellValueFactory(new PropertyValueFactory<>("Last Check in"));
        lastcheckoutcolofattendancerecordtableTv.setCellValueFactory(new PropertyValueFactory<>("Last Check out"));
        processedbycolofattendancerecordtableTv.setCellValueFactory(new PropertyValueFactory<>("Processed by "));


    }

    @javafx.fxml.FXML
    public void scanOAbutton(ActionEvent actionEvent) {

        if (memberidTF.getText().isEmpty()){
            memberidscannedlabel.setText("Enter Member ID");
            return;
        }
        memberidscannedlabel.setText("Member ID scanned: " + memberidTF.getText());
        entermemberidlabel.setText("Enter Member ID");


    }

    @javafx.fxml.FXML
    public void checkoutOAbutton(ActionEvent actionEvent) {
        if(memberidTF.getText().isEmpty()){
            checkoutstatuslabel.setText("Enter Member ID first");
            return;
        }
        checkoutstatuslabel.setText("Check-out confirmed at " + LocalTime.now());
    }

    @javafx.fxml.FXML
    public void checkinOAbutton(ActionEvent actionEvent) {

        if(memberidTF.getText().isEmpty()){
            checkinstatuslabel.setText("Enter Member ID first");
            return;
        }
        checkinstatuslabel.setText("Check-in confirmed at " + LocalTime.now());



    }
}