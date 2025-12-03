package com.group8.gymfitnesscenter.Nutritionist;

import javafx.event.ActionEvent;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
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
    public void initialize() {
        selectclientCB.getItems().addAll("Client ID","Client name ","Gender");
        datecolumnofclientinformationTV.setCellValueFactory(new PropertyValueFactory<>("Date"));
        weightcolumnofclientinformationTV.setCellValueFactory(new PropertyValueFactory<>("Weight"));
        caloriescolumnofclientinformationTV.setCellValueFactory(new PropertyValueFactory<>("Calories"));
        notescolumnofclientinformationTV.setCellValueFactory(new PropertyValueFactory<>("Notes"));



    }

    @javafx.fxml.FXML
    public void saveplanOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void validateprogressOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void viewprogressOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void savechangesOAbutton(ActionEvent actionEvent) {
    }
}