package com.group8.gymfitnesscenter.Nutritionist;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class AdjustDietPlan
{
    @javafx.fxml.FXML
    private ComboBox<String> selectclientCB;
    @javafx.fxml.FXML
    private TextField breatfastTextField;
    @javafx.fxml.FXML
    private TextField lunchTextField;
    @javafx.fxml.FXML
    private TableColumn<clientprogress,Double>weightcolumnofclientinformationTV;
    @javafx.fxml.FXML
    private TableColumn<clientprogress,String> notescolumnofclientinformationTV;
    @javafx.fxml.FXML
    private TableColumn<clientprogress, LocalDate> datecolumnofclientinformationTV;
    @javafx.fxml.FXML
    private TextField dinnerTextField;
    @javafx.fxml.FXML
    private TableColumn<clientprogress,Integer> caloriescolumnofclientinformationTV;
    @javafx.fxml.FXML
    private TableView <clientprogress>clientinformationTV;
    @javafx.fxml.FXML
    private Label saveplanlabel;
    @javafx.fxml.FXML
    private Label clientnotificationlabel;
    @javafx.fxml.FXML
    private Label mealstatuslabel;

    @javafx.fxml.FXML
    public void initialize() {
        selectclientCB.getItems().addAll("Client 1 Nusrat","Client 2 Jahan ","Client 3 Sumaiya");
        datecolumnofclientinformationTV.setCellValueFactory(new PropertyValueFactory<>("Date"));
        weightcolumnofclientinformationTV.setCellValueFactory(new PropertyValueFactory<>("Weight"));
        caloriescolumnofclientinformationTV.setCellValueFactory(new PropertyValueFactory<>("Calories"));
        notescolumnofclientinformationTV.setCellValueFactory(new PropertyValueFactory<>("Notes"));



    }

    @javafx.fxml.FXML
    public void saveplanOAbutton(ActionEvent actionEvent) {

        saveplanlabel.setText("Diet Plan Saved!");
    }

    @javafx.fxml.FXML
    public void validateprogressOAbutton(ActionEvent actionEvent) {

        clientnotificationlabel.setText("Client Notified!");
    }

    @javafx.fxml.FXML
    public void viewprogressOAbutton(ActionEvent actionEvent) {


    }



    @javafx.fxml.FXML
    public void savechangesOAbutton(ActionEvent actionEvent) {

        System.out.println("Breakfast:"+breatfastTextField.getText()+
                " Lunch:"+lunchTextField.getText()+
                " Dinner:"+dinnerTextField.getText());
        mealstatuslabel.setText("Meal details updated.");
    }
}