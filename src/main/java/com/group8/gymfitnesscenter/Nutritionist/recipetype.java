package com.group8.gymfitnesscenter.Nutritionist;

import java.time.LocalDate;

public class recipetype {

    private String MealName;
    private String MealType;
    private Integer Calories;
    private LocalDate LastUpdated;

    public recipetype(String mealName, String mealType, Integer calories, LocalDate lastUpdated) {
        MealName = mealName;
        MealType = mealType;
        Calories = calories;
        LastUpdated = lastUpdated;
    }

    public String getMealName() {
        return MealName;
    }

    public void setMealName(String mealName) {
        MealName = mealName;
    }

    public Integer getCalories() {
        return Calories;
    }

    public void setCalories(Integer calories) {
        Calories = calories;
    }

    public String getMealType() {
        return MealType;
    }

    public void setMealType(String mealType) {
        MealType = mealType;
    }

    public LocalDate getLastUpdated() {
        return LastUpdated;
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        LastUpdated = lastUpdated;
    }

    @Override
    public String toString() {
        return "recipetype{" +
                "MealName='" + MealName + '\'' +
                ", MealType='" + MealType + '\'' +
                ", Calories=" + Calories +
                ", LastUpdated=" + LastUpdated +
                '}';
    }
}
