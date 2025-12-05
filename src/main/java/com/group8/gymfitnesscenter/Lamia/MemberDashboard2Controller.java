package com.group8.gymfitnesscenter.Lamia.Member;

import com.group8.gymfitnesscenter.Lamia.BaseController;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class MemberDashboard2Controller extends BaseController
{
    @FXML
    private Label userNameLabel;

    @FXML
    private Label ageLabel;

    @FXML
    private Label weightLabel;
    @FXML
    private Label membershipTypeLabel;
    @FXML
    private Label membershipIDLabel;

    @FXML
    public void initialize() {
        userNameLabel.setText(UserData.getName());
        ageLabel.setText(String.valueOf(UserData.getAge()));
        weightLabel.setText(String.valueOf(UserData.getWeight()));
        membershipTypeLabel.setText(UserData.getMembership());
        membershipIDLabel.setText(UserData.getMemberID());


    }

    @FXML
    public void openCheckin(ActionEvent actionEvent) throws IOException {
        switchTo(actionEvent, "/com/group8/gymfitnesscenter/memberScreens/CheckIn.fxml");
    }

    @FXML
    public void openBookClass(ActionEvent actionEvent) throws IOException {
        switchTo(actionEvent, "/com/group8/gymfitnesscenter/memberScreens/BookClass.fxml");
    }

    @FXML
    public void signOut(ActionEvent actionEvent) throws IOException {
        switchTo(actionEvent, "/com/group8/gymfitnesscenter/RegisterType.fxml");
    }

    @FXML
    public void openFeedback(ActionEvent actionEvent) throws IOException {
        switchTo(actionEvent, "/com/group8/gymfitnesscenter/memberScreens/Feedback.fxml");
    }

    @FXML
    public void openTrackProgress(ActionEvent actionEvent) throws IOException {
        switchTo(actionEvent, "/com/group8/gymfitnesscenter/memberScreens/Progress.fxml");
    }

    @FXML
    public void openCancelBooking(ActionEvent actionEvent) throws IOException {
        switchTo(actionEvent, "/com/group8/gymfitnesscenter/memberScreens/CancelBooking.fxml");
    }

    @FXML
    public void openPayMembership(ActionEvent actionEvent) throws IOException {
        switchTo(actionEvent, "/com/group8/gymfitnesscenter/memberScreens/Payment.fxml");
    }

    @FXML
    public void openProfile(ActionEvent actionEvent) throws IOException {
        switchTo(actionEvent, "/com/group8/gymfitnesscenter/memberScreens/Profile.fxml");
    }

    @FXML
    public void openEquipmentUsage(ActionEvent actionEvent) throws IOException {
        switchTo(actionEvent, "/com/group8/gymfitnesscenter/memberScreens/Equipment.fxml");
    }

    @FXML
    public void openHome(Event event) {

    }
}