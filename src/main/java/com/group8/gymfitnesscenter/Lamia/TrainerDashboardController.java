package com.group8.gymfitnesscenter.Lamia.Trainer;

import com.group8.gymfitnesscenter.Lamia.BaseController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.io.IOException;

public class TrainerDashboardController extends BaseController {

    @FXML
    private Label trainerNameLabel;

    @FXML
    public void initialize() {

        if (TrainerData.getName() != null) {
            trainerNameLabel.setText(TrainerData.getName());
        }
    }

    @FXML
    public void manageBookings(ActionEvent actionEvent) throws IOException {
        switchTo(actionEvent, "/com/group8/gymfitnesscenter/trainerScreens/ApproveDeclineBookings.fxml");
    }

    @FXML
    public void manageCapacity(ActionEvent actionEvent) throws IOException {
        switchTo(actionEvent, "/com/group8/gymfitnesscenter/trainerScreens/ManageClassCapacity.fxml");
    }

    @FXML
    public void updateAvailability(ActionEvent actionEvent) throws IOException {
        switchTo(actionEvent, "/com/group8/gymfitnesscenter/trainerScreens/UpdateAvailability.fxml");
    }

    @FXML
    public void manageClassSchedule(ActionEvent actionEvent) throws IOException {
        switchTo(actionEvent, "/com/group8/gymfitnesscenter/trainerScreens/CancelRescheduleClass.fxml");
    }

    @FXML
    public void conductSession(ActionEvent actionEvent) throws IOException {
        switchTo(actionEvent, "/com/group8/gymfitnesscenter/trainerScreens/ConductSession.fxml");
    }

    @FXML
    public void trackProgress(ActionEvent actionEvent) throws IOException {
        switchTo(actionEvent, "/com/group8/gymfitnesscenter/trainerScreens/TrackProgress.fxml");
    }

    @FXML
    public void signOut(ActionEvent actionEvent) throws IOException {


        switchTo(actionEvent, "/com/group8/gymfitnesscenter/RegisterType.fxml");
    }
}
