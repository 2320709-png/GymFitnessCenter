package com.group8.gymfitnesscenter.Nutritionist;

import java.time.LocalDate;

public class ClientHealthSummary {

    private Integer Calories;
    private Double BMI;
    private String Notes;
    private LocalDate Date;
    private Integer Weight;
    private Integer BloodPressure;

    public ClientHealthSummary(Integer calories, Double BMI, String notes, LocalDate date, Integer weight, Integer bloodPressure) {
        Calories = calories;
        this.BMI = BMI;
        Notes = notes;
        Date = date;
        Weight = weight;
        BloodPressure = bloodPressure;
    }

    public Integer getCalories() {
        return Calories;
    }

    public void setCalories(Integer calories) {
        Calories = calories;
    }

    public Double getBMI() {
        return BMI;
    }

    public void setBMI(Double BMI) {
        this.BMI = BMI;
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

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String notes) {
        Notes = notes;
    }

    public Integer getBloodPressure() {
        return BloodPressure;
    }

    public void setBloodPressure(Integer bloodPressure) {
        BloodPressure = bloodPressure;
    }

    @Override
    public String toString() {
        return "ClientHealthSummary{" +
                "Calories=" + Calories +
                ", BMI=" + BMI +
                ", Notes='" + Notes + '\'' +
                ", Date=" + Date +
                ", Weight=" + Weight +
                ", BloodPressure=" + BloodPressure +
                '}';
    }
}
