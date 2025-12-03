package com.group8.gymfitnesscenter.Nutritionist;

import javafx.event.ActionEvent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class NutritionLibrary
{
    @javafx.fxml.FXML
    private TableColumn<recipetype,String> recipenamecolofrecipeTV;
    @javafx.fxml.FXML
    private TextField caloriesTextField;
    @javafx.fxml.FXML
    private TableColumn<recipetype,String> mealtypecolofrecipeTV;
    @javafx.fxml.FXML
    private TableColumn<recipetype,Integer> caloriescolofrecipeTV;
    @javafx.fxml.FXML
    private TableView<recipetype> recipeTV;
    @javafx.fxml.FXML
    private TextField recipenameTextField;
    @javafx.fxml.FXML
    private TextArea ingrediantsTextArea;
    @javafx.fxml.FXML
    private TextArea instructionTextArea;
    @javafx.fxml.FXML
    private ComboBox<String> mealtypeCB;
    @javafx.fxml.FXML
    private TableColumn<recipetype, LocalDate> lastupdatedcolofrecipeTV;

    @javafx.fxml.FXML
    public void initialize() {
        mealtypeCB.getItems().addAll("Breakfast","Lunch ","Dinner");


        recipenamecolofrecipeTV.setCellValueFactory(new PropertyValueFactory<>("Recipe NAme"));
        caloriescolofrecipeTV.setCellValueFactory(new PropertyValueFactory<>("Calories"));
        lastupdatedcolofrecipeTV.setCellValueFactory(new PropertyValueFactory<>("Last Updated"));
        mealtypecolofrecipeTV.setCellValueFactory(new PropertyValueFactory<>("Meal type"));
    }

    @javafx.fxml.FXML
    public void addnewrecipeOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void saveOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void cancelOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void editselectedrecipeOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void deleterecipeOAbutton(ActionEvent actionEvent) {
    }
}