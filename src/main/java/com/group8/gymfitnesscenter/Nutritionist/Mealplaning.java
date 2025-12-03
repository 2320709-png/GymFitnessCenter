package com.group8.gymfitnesscenter.Nutritionist;

import java.time.LocalDate;

public class Mealplaning {
    private Integer Calories;
    private String Instructions;
    private String MealTypees;
    private String MealName;

    public Mealplaning(Integer calories, String instructions, String mealTypees, String mealName) {
        Calories = calories;
        Instructions = instructions;
        MealTypees = mealTypees;
        MealName = mealName;
    }

    public Integer getCalories() {
        return Calories;
    }

    public void setCalories(Integer calories) {
        Calories = calories;
    }

    public String getInstructions() {
        return Instructions;
    }

    public void setInstructions(String instructions) {
        Instructions = instructions;
    }

    public String getMealTypees() {
        return MealTypees;
    }

    public void setMealTypees(String mealTypees) {
        MealTypees = mealTypees;
    }

    public String getMealName() {
        return MealName;
    }

    public void setMealName(String mealName) {
        MealName = mealName;
    }

    @Override
    public String toString() {
        return "Mealplaning{" +
                "Calories=" + Calories +
                ", Instructions='" + Instructions + '\'' +
                ", MealTypees='" + MealTypees + '\'' +
                ", MealName='" + MealName + '\'' +
                '}';
    }
}
