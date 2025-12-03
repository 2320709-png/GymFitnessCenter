package com.group8.gymfitnesscenter.Receptionist;

import javafx.event.ActionEvent;
import javafx.scene.control.*;

import java.time.LocalDate;

public class InquiryComplaintDesk
{
    @javafx.fxml.FXML
    private ComboBox<String> resolutionstatusCB;
    @javafx.fxml.FXML
    private TableView<InquiryInformationMC> inquirytableTV;
    @javafx.fxml.FXML
    private TableColumn<InquiryInformationMC,String> statuscolofinquirytableTV;
    @javafx.fxml.FXML
    private TableColumn<InquiryInformationMC,String> categorycolofinquirytableTV;
    @javafx.fxml.FXML
    private TableColumn<InquiryInformationMC,Integer> memberidcolofinquirytableTV;
    @javafx.fxml.FXML
    private TableColumn<InquiryInformationMC, LocalDate> dateofsubmissioncolofinquirytableTV;
    @javafx.fxml.FXML
    private TableColumn<InquiryInformationMC,Integer> inquiryiidcolofinquirytableTV;
    @javafx.fxml.FXML
    private TableColumn<InquiryInformationMC,String> assignedtocolofinquirytableTV;
    @javafx.fxml.FXML
    private TableColumn<InquiryInformationMC,String> notecolofinquirytableTV;
    @javafx.fxml.FXML
    private TableColumn<InquiryInformationMC,String> membernamecolofinquirytableTV;
    @javafx.fxml.FXML
    private TableColumn<InquiryInformationMC,String> descriptioncolofinquirytableTV;
    @javafx.fxml.FXML
    private ComboBox<String> issuecategoryCB;
    @javafx.fxml.FXML
    private ComboBox<String> categoryCB;
    @javafx.fxml.FXML
    private ComboBox<String> choosestaffCB;
    @javafx.fxml.FXML
    private TextArea inquirydescriptionTextArea;
    @javafx.fxml.FXML
    private TextField memberidTf;

    @javafx.fxml.FXML
    public void initialize() {
        resolutionstatusCB.getItems().addAll("Resolved","Pending");
        issuecategoryCB.getItems().addAll("Booking","Check in delay","Checkout issue","Payment issue","Others");
        choosestaffCB.getItems().addAll("Receptionist","Nutritionist","Trainer","Others");
        categoryCB.getItems().addAll("Appoinment Manage","Client registration","Payment");
    }

    @javafx.fxml.FXML
    public void forwardOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updatestatusOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveinquiryOAbutton(ActionEvent actionEvent) {
    }
}