package com.group8.gymfitnesscenter;

import com.group8.gymfitnesscenter.Lamia.BaseController;
import javafx.event.ActionEvent;

import java.io.IOException;

public class RegisterTypeController extends BaseController
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void openNutritionist(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void openMember(ActionEvent actionEvent) throws IOException {
        switchTo(actionEvent, "/com/group8/gymfitnesscenter/memberScreens/Register.fxml");
    }

    @javafx.fxml.FXML
    public void openVendor(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void openSalesOfficer(ActionEvent actionEvent) throws IOException {
        switchTo(actionEvent, "/com/group8/gymfitnesscenter/SalesManagerView/SalesManagerDashboard.fxml");

    }

    @javafx.fxml.FXML
    public void openReceptionist(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void openTrainer(ActionEvent actionEvent) throws IOException {
        switchTo(actionEvent, "/com/group8/gymfitnesscenter/trainerScreens/trainer_register.fxml");
    }

    @javafx.fxml.FXML
    public void openContentCreator(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void openGymManager(ActionEvent actionEvent) {
    }
}