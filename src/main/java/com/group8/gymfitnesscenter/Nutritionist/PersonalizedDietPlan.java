package com.group8.gymfitnesscenter.Nutritionist;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class PersonalizedDietPlan
{
    @javafx.fxml.FXML
    private ComboBox<String> clientlistCB;
    @javafx.fxml.FXML
    private TextField mealnameTextField;
    @javafx.fxml.FXML
    private TableView<ClientHealthSummary> clienthealthsummaryTV;
    @javafx.fxml.FXML
    private TableColumn<Mealplaning,String> mealtypecolofmealplanTV;
    @javafx.fxml.FXML
    private TableColumn<ClientHealthSummary,String> notescolofclienthealthsummaryTV;
    @javafx.fxml.FXML
    private TableColumn<ClientHealthSummary, LocalDate> datecolofclienthealthsummaryTV;
    @javafx.fxml.FXML
    private TableColumn<Mealplaning,Integer> caloriescolofmealplanTV;
    @javafx.fxml.FXML
    private TableColumn<ClientHealthSummary,Double> bmicolofclienthealthsummaryTV;
    @javafx.fxml.FXML
    private TableColumn<ClientHealthSummary,Integer> weightcolofclienthealthsummaryTV;
    @javafx.fxml.FXML
    private TableColumn<ClientHealthSummary,Integer>bloodpressurecolofclienthealthsummaryTV;
    @javafx.fxml.FXML
    private TextField caloriesTextField;
    @javafx.fxml.FXML
    private TableColumn<Mealplaning,String> instructioncolofmealplanTV;
    @javafx.fxml.FXML
    private TableColumn<Mealplaning,String> mealnamecolofmealplanTV;
    @javafx.fxml.FXML
    private TableView<Mealplaning> mealplanTV;
    @javafx.fxml.FXML
    private Button clientinformationTextField;
    @javafx.fxml.FXML
    private ComboBox<String> mealtypeCB;
    @javafx.fxml.FXML
    private TextArea dietinstructionTextArea;

    @javafx.fxml.FXML
    public void initialize() {
        clientlistCB.getItems().addAll("Client name","Client ID","Gender");
        mealtypeCB.getItems().addAll("Breakfast","Lunch ","Dinner");

        datecolofclienthealthsummaryTV.setCellValueFactory(new PropertyValueFactory<>("Date"));
        weightcolofclienthealthsummaryTV.setCellValueFactory(new PropertyValueFactory<>("Weight"));
        bmicolofclienthealthsummaryTV.setCellValueFactory(new PropertyValueFactory<>("BMI"));
        bloodpressurecolofclienthealthsummaryTV.setCellValueFactory(new PropertyValueFactory<>("Blood pressure"));
        notescolofclienthealthsummaryTV.setCellValueFactory(new PropertyValueFactory<>("Notes"));
        mealnamecolofmealplanTV.setCellValueFactory(new PropertyValueFactory<>("Meal Name"));
        mealtypecolofmealplanTV.setCellValueFactory(new PropertyValueFactory<>("Meal type"));
        caloriescolofmealplanTV.setCellValueFactory(new PropertyValueFactory<>("Calories"));
        instructioncolofmealplanTV.setCellValueFactory(new PropertyValueFactory<>("Instruction "));







    }

    @javafx.fxml.FXML
    public void clientinformationonactionbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void addmealOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void senddietplantoclientOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void savedietplanOAbutton(ActionEvent actionEvent) {
    }
}