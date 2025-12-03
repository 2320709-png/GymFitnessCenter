package com.group8.gymfitnesscenter.Nutritionist;

import java.time.LocalDate;

public class clientfoodlog {
    private Integer Calories;
    private String meal;
    private String Notes;
    private LocalDate Date;

    public clientfoodlog(Integer calories, String meal, String notes, LocalDate date) {
        Calories = calories;
        this.meal = meal;
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

    public String getMeal() {
        return meal;
    }

    public void setMeal(String meal) {
        this.meal = meal;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "clientfoodlog{" +
                "Calories=" + Calories +
                ", meal='" + meal + '\'' +
                ", Notes='" + Notes + '\'' +
                ", Date=" + Date +
                '}';
    }
}
