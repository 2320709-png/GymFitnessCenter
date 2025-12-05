package com.group8.gymfitnesscenter.Lamia;

import com.group8.gymfitnesscenter.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class BaseController {
    public void goBack(ActionEvent actionEvent) throws IOException {
        switchTo(actionEvent, "/com/group8/gymfitnesscenter/memberScreens/MemberDashboard2.fxml");
    }
    public void goBackk(ActionEvent actionEvent) throws IOException {
        switchTo(actionEvent, "/com/group8/gymfitnesscenter/trainerScreens/TrainerDashboard.fxml");
    }
    public void goBacks(ActionEvent actionEvent) throws IOException {
        switchTo(actionEvent, "/com/group8/gymfitnesscenter/SalesManagerView/SalesManagerDashboard.fxml");
    }

    @javafx.fxml.FXML
    public void signOut(ActionEvent actionEvent) throws IOException {
        switchTo(actionEvent, "/com/group8/gymfitnesscenter/memberScreens/MemberDashboard2.fxml");
    }

    public static void switchTo(ActionEvent event, String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource(fxml));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.setScene(scene);
    }
}
