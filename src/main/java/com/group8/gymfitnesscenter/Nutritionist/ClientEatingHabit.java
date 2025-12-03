package com.group8.gymfitnesscenter.Nutritionist;

import javafx.event.ActionEvent;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class ClientEatingHabit
{
    @javafx.fxml.FXML
    private TableColumn<clientfoodlog,Integer> caloriescolofclientsfoodlogTV;
    @javafx.fxml.FXML
    private TableColumn<comparisonTable,String> matchorunmatchcolofcomparisonTV;
    @javafx.fxml.FXML
    private TableColumn<clientfoodlog,String> mealcolofclientsfoodlogTV;
    @javafx.fxml.FXML
    private TextArea entercommentsTextArea;
    @javafx.fxml.FXML
    private TableColumn<clientfoodlog, LocalDate> datecolofclientsfoodlogTV;
    @javafx.fxml.FXML
    private TableView<clientfoodlog> clientsfoodlogTV;
    @javafx.fxml.FXML
    private TableView<comparisonTable> comparisonTV;
    @javafx.fxml.FXML
    private TableColumn<comparisonTable,String> notescolofclientsfoodlogTV;
    @javafx.fxml.FXML
    private TableColumn<comparisonTable,String> foodcolofcomparisonTV;
    @javafx.fxml.FXML
    private TableColumn<comparisonTable,String> dietplancolofcomparisonTV;

    @javafx.fxml.FXML
    public void initialize() {
        datecolofclientsfoodlogTV.setCellValueFactory(new PropertyValueFactory<>("Date"));
        mealcolofclientsfoodlogTV.setCellValueFactory(new PropertyValueFactory<>("Meal"));
        caloriescolofclientsfoodlogTV.setCellValueFactory(new PropertyValueFactory<>("Calories"));
        notescolofclientsfoodlogTV.setCellValueFactory(new PropertyValueFactory<>("Notes"));
        foodcolofcomparisonTV.setCellValueFactory(new PropertyValueFactory<>("Food"));
        dietplancolofcomparisonTV.setCellValueFactory(new PropertyValueFactory<>("Diet plan"));
        matchorunmatchcolofcomparisonTV.setCellValueFactory(new PropertyValueFactory<>("Match/Not match"));





    }

    @javafx.fxml.FXML
    public void cpmparewithlogOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void loadfoodlogOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void updateprogressOAbutton(ActionEvent actionEvent) {
    }

    @Deprecated
    public void updatemeallogOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void savecommentOAbutton(ActionEvent actionEvent) {
    }

    @javafx.fxml.FXML
    public void uploadmeallogOAbutton(ActionEvent actionEvent) {
    }
}