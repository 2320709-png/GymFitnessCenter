package com.group8.gymfitnesscenter.Nutritionist;

import java.time.LocalDate;

public class clientwithallergyproblemprofileTable {


    private String Description;
    private String Allergy;
    private LocalDate Date;

    public clientwithallergyproblemprofileTable(String description, String allergy, LocalDate date) {
        Description = description;
        Allergy = allergy;
        Date = date;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getAllergy() {
        return Allergy;
    }

    public void setAllergy(String allergy) {
        Allergy = allergy;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "clientwithallergyproblemprofileTable{" +
                "Description='" + Description + '\'' +
                ", Allergy='" + Allergy + '\'' +
                ", Date=" + Date +
                '}';
    }
}
