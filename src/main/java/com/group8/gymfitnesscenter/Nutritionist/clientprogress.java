package com.group8.gymfitnesscenter.Nutritionist;

import java.time.LocalDate;

public class clientprogress {
    private Integer Calories;
    private Integer Weight;
    private String Notes;
    private LocalDate Date;

    public clientprogress(Integer calories, Integer weight, String notes, LocalDate date) {
        Calories = calories;
        Weight = weight;
        Notes = notes;
        Date = date;
    }

    public Integer getCalories() {
        return Calories;
    }

    public void setCalories(Integer calories) {
        Calories = calories;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    public Integer getWeight() {
        return Weight;
    }

    public void setWeight(Integer weight) {
        Weight = weight;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "clientprogress{" +
                "Calories=" + Calories +
                ", Weight=" + Weight +
                ", Notes='" + Notes + '\'' +
                ", Date=" + Date +
                '}';
    }
}
