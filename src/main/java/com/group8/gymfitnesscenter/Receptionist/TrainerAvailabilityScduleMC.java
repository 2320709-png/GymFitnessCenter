package com.group8.gymfitnesscenter.Receptionist;

import java.time.LocalDate;

public class TrainerAvailabilityScduleMC {

    private Integer ExistingClasses;
    private String AvailabilityStatus;
    private String ClassName;
    private String TrainerName;

    private String AvailabilityUntil;
    private String AvailabilityFrom;
    private LocalDate Date;

    public TrainerAvailabilityScduleMC(Integer existingClasses, String availabilityStatus, String className, String trainerName, String availabilityUntil, String availabilityFrom, LocalDate date) {
        ExistingClasses = existingClasses;
        AvailabilityStatus = availabilityStatus;
        ClassName = className;
        TrainerName = trainerName;
        AvailabilityUntil = availabilityUntil;
        AvailabilityFrom = availabilityFrom;
        Date = date;
    }

    public Integer getExistingClasses() {
        return ExistingClasses;
    }

    public void setExistingClasses(Integer existingClasses) {
        ExistingClasses = existingClasses;
    }

    public String getAvailabilityStatus() {
        return AvailabilityStatus;
    }

    public void setAvailabilityStatus(String availabilityStatus) {
        AvailabilityStatus = availabilityStatus;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getTrainerName() {
        return TrainerName;
    }

    public void setTrainerName(String trainerName) {
        TrainerName = trainerName;
    }

    public String getAvailabilityUntil() {
        return AvailabilityUntil;
    }

    public void setAvailabilityUntil(String availabilityUntil) {
        AvailabilityUntil = availabilityUntil;
    }

    public String getAvailabilityFrom() {
        return AvailabilityFrom;
    }

    public void setAvailabilityFrom(String availabilityFrom) {
        AvailabilityFrom = availabilityFrom;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "TrainerAvailabilityScduleMC{" +
                "ExistingClasses=" + ExistingClasses +
                ", AvailabilityStatus='" + AvailabilityStatus + '\'' +
                ", ClassName='" + ClassName + '\'' +
                ", TrainerName='" + TrainerName + '\'' +
                ", AvailabilityUntil='" + AvailabilityUntil + '\'' +
                ", AvailabilityFrom='" + AvailabilityFrom + '\'' +
                ", Date=" + Date +
                '}';
    }
}
