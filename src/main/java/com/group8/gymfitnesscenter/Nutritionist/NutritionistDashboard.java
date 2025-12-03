package com.group8.gymfitnesscenter.Nutritionist;

import com.group8.gymfitnesscenter.HelloApplication;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class NutritionistDashboard
{
    @javafx.fxml.FXML
    public void initialize() {
    }

    @javafx.fxml.FXML
    public void allergiesandrestrictionsonactionbutton(ActionEvent actionEvent) throws IOException {

        Parent root=null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("HealthAlerts.fxml"));
        root = fxmlLoader.load();


        Scene scene = new Scene(root) ;
        Stage stage =(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void consultwithtraineronactionbutton(ActionEvent actionEvent) throws IOException {

        Parent root=null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("TrainerConsultration.fxml"));
        root = fxmlLoader.load();


        Scene scene = new Scene(root) ;
        Stage stage =(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();

    }

    @javafx.fxml.FXML
    public void groupnutritionworkshopsonactionbutton(ActionEvent actionEvent) throws IOException {

        Parent root=null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("NutritionWorkshop.fxml"));
        root = fxmlLoader.load();


        Scene scene = new Scene(root) ;
        Stage stage =(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void trackclienteatinghabitsonactionbutton(ActionEvent actionEvent) throws IOException {

        Parent root=null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("ClientEatingHabit.fxml"));
        root = fxmlLoader.load();


        Scene scene = new Scene(root) ;
        Stage stage =(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void dietplansonactionbutton(ActionEvent actionEvent) throws IOException {

        Parent root=null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("PersonalizedDietPlan.fxml"));
        root = fxmlLoader.load();


        Scene scene = new Scene(root) ;
        Stage stage =(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void adjustdietsonactionbutton(ActionEvent actionEvent) throws IOException {
        Parent root=null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("AdjustDietPlan.fxml"));
        root = fxmlLoader.load();


        Scene scene = new Scene(root) ;
        Stage stage =(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void dietremindersonactionbutton(ActionEvent actionEvent) throws IOException {

        Parent root=null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("DietReminders.fxml"));
        root = fxmlLoader.load();


        Scene scene = new Scene(root) ;
        Stage stage =(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }

    @javafx.fxml.FXML
    public void updatenutritionlibraryonactionbutton(ActionEvent actionEvent) throws IOException {

        Parent root=null;
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("NutritionLibrary.fxml"));
        root = fxmlLoader.load();


        Scene scene = new Scene(root) ;
        Stage stage =(Stage)((Node)actionEvent.getSource()).getScene().getWindow();

        stage.setScene(scene);
        stage.show();
    }
}