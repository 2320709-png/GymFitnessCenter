package com.group8.gymfitnesscenter.Receptionist;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class BookingApprovalCenter
{
    @javafx.fxml.FXML
    private TextArea reasonforrejectionTextArea;
    @javafx.fxml.FXML
    private TableColumn<BookingInformationMC, LocalDate> requesteddatecolofbookinginformationtableTV;
    @javafx.fxml.FXML
    private TableColumn<BookingInformationMC,Integer> bookingidcolofbookinginformationtableTV;
    @javafx.fxml.FXML
    private TableColumn<BookingInformationMC,String> trainercolofbookinginformationtableTV;
    @javafx.fxml.FXML
    private TableView<BookingInformationMC> bookinginformationtableTV;
    @javafx.fxml.FXML
    private TableColumn<BookingInformationMC,String> statuscolofbookinginformationtableTV;
    @javafx.fxml.FXML
    private TableColumn<BookingInformationMC,Integer> memberidcolofbookinginformationtableTV;
    @javafx.fxml.FXML
    private TableColumn<BookingInformationMC,String> membernamecolofbookinginformationtableTV;

    @javafx.fxml.FXML
    public void initialize() {

        requesteddatecolofbookinginformationtableTV.setCellValueFactory(new PropertyValueFactory<>("Requested DAte "));
        bookingidcolofbookinginformationtableTV.setCellValueFactory(new PropertyValueFactory<>("Booking Id"));
        trainercolofbookinginformationtableTV.setCellValueFactory(new PropertyValueFactory<>("Trainer"));
        statuscolofbookinginformationtableTV.setCellValueFactory(new PropertyValueFactory<>("Status"));
        memberidcolofbookinginformationtableTV.setCellValueFactory(new PropertyValueFactory<>("Member ID"));
        membernamecolofbookinginformationtableTV.setCellValueFactory(new PropertyValueFactory<>("Member name"));

    }

    @javafx.fxml.FXML
    public void approveOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void refreshOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void rejectOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void checkslotOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveconfirmationOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void notifymemberOAbutton(ActionEvent actionEvent) {
    }
}