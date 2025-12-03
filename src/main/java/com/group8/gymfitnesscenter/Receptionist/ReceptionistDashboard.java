package com.group8.gymfitnesscenter.Receptionist;

import com.group8.gymfitnesscenter.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

import java.io.IOException;

public class ReceptionistDashboard
{

    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void membershippaymentsOAbutton(ActionEvent actionEvent) throws IOException {

        Parent root=null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MembershipsPayment.fxml"));
        root = fxmlLoader.load();


        Scene scene = new Scene(root) ;
        Stage stage =(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void classschedulemanagementOAbutton(ActionEvent actionEvent) throws IOException {
        Parent root=null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ClassScheduleManagement.fxml"));
        root = fxmlLoader.load();


        Scene scene = new Scene(root) ;
        Stage stage =(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void inquiryandcomplaintdeskOAbutton(ActionEvent actionEvent) throws IOException {
        Parent root=null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("InquiryComplaintDesk.fxml"));
        root = fxmlLoader.load();


        Scene scene = new Scene(root) ;
        Stage stage =(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void memberregistrationOAbutton(ActionEvent actionEvent) throws IOException {
        Parent root=null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("MemberRegistration.fxml"));
        root = fxmlLoader.load();


        Scene scene = new Scene(root) ;
        Stage stage =(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void dailyattendancereportsOAbutton(ActionEvent actionEvent) throws IOException {
        Parent root=null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DailyAttendanceReports.fxml"));
        root = fxmlLoader.load();


        Scene scene = new Scene(root) ;
        Stage stage =(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void bookingapprovalcenterOAbutton(ActionEvent actionEvent) throws IOException {
        Parent root=null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("BookingApprovalCenter.fxml"));
        root = fxmlLoader.load();


        Scene scene = new Scene(root) ;
        Stage stage =(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void renewalremindersystemOAbutton(ActionEvent actionEvent) throws IOException {
        Parent root=null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("RenewalReminderSystem.fxml"));
        root = fxmlLoader.load();


        Scene scene = new Scene(root) ;
        Stage stage =(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void attendancecheckinoutOAbutton(ActionEvent actionEvent) throws IOException {
        Parent root=null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("AttendanceCheck.fxml"));
        root = fxmlLoader.load();


        Scene scene = new Scene(root) ;
        Stage stage =(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }
}