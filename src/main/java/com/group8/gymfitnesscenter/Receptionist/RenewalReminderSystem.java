package com.group8.gymfitnesscenter.Receptionist;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.time.LocalDate;

public class RenewalReminderSystem
{
    @javafx.fxml.FXML
    private TableColumn<ReminderLogMC,String> methodcolofreminderlogTV;
    @javafx.fxml.FXML
    private TableView<ExpiryMemberMC> expirymemberTV;
    @javafx.fxml.FXML
    private TableColumn<ExpiryMemberMC,LocalDate> lastreminderdatecolofexpirymemberTV;
    @javafx.fxml.FXML
    private TableColumn<ReminderLogMC,Integer> memberidcolofreminderlogTV;
    @javafx.fxml.FXML
    private TableColumn<ExpiryMemberMC,String> membernamecolofexpirymemberTV;
    @javafx.fxml.FXML
    private TableColumn<ReminderLogMC,String> membernamecolofreminderlogTV;
    @javafx.fxml.FXML
    private TableColumn<ExpiryMemberMC,Integer> memberidcolofexpirymemberTV;
    @javafx.fxml.FXML
    private TableColumn<ReminderLogMC,Integer> logidcolofreminderlogTV;
    @javafx.fxml.FXML
    private TableColumn<ExpiryMemberMC,String> membershiplancolofexpirymemberTV;
    @javafx.fxml.FXML
    private TableColumn<ExpiryMemberMC,String> reminderstatuscolofexpirymemberTV;
    @javafx.fxml.FXML
    private TableColumn<ExpiryMemberMC,LocalDate> expirydatecolofexpirymemberTV;
    @javafx.fxml.FXML
    private TableColumn<ReminderLogMC, LocalDate> reminderdatecolofreminderlogTV;
    @javafx.fxml.FXML
    private TableView<ReminderLogMC> reminderlogTV;
    @javafx.fxml.FXML
    private TableColumn<ReminderLogMC,String> statuscolofreminderlogTV;
    @javafx.fxml.FXML
    private TableColumn<ExpiryMemberMC,Integer> phonecolofexpirymemberTV;

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void selectallOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void sendreminderOAbutton(ActionEvent actionEvent) {
    }
}