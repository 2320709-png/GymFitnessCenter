package com.group8.gymfitnesscenter.Nutritionist;

import java.time.LocalDate;

public class clientdietplanTable {
    private Integer Quantity;
    private String Meal;
    private String Notes;

    public clientdietplanTable(Integer quantity, String meal, String notes) {
        Quantity = quantity;
        Meal = meal;
        Notes = notes;
    }

    public Integer getQuantity() {
        return Quantity;
    }

    public void setQuantity(Integer quantity) {
        Quantity = quantity;
    }

    public String getMeal() {
        return Meal;
    }

    public void setMeal(String meal) {
        Meal = meal;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    @Override
    public String toString() {
        return "clientdietplanTable{" +
                "Quantity=" + Quantity +
                ", Meal='" + Meal + '\'' +
                ", Notes='" + Notes + '\'' +
                '}';
    }
}
