package com.group8.gymfitnesscenter.Receptionist;

import java.time.LocalDate;

public class ClassScheduleMC {

    private Integer Capacity;
    private String Status;
    private String ClassName;
    private String TrainerName;
    private String checkouttime;
    private String EndTime;
    private String StartTime;
    private LocalDate Date;

    public ClassScheduleMC(Integer capacity, String status, String className, String trainerName, String checkouttime, String endTime, String startTime, LocalDate date) {
        Capacity = capacity;
        Status = status;
        ClassName = className;
        TrainerName = trainerName;
        this.checkouttime = checkouttime;
        EndTime = endTime;
        StartTime = startTime;
        Date = date;
    }

    public Integer getCapacity() {
        return Capacity;
    }

    public void setCapacity(Integer capacity) {
        Capacity = capacity;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getClassName() {
        return ClassName;
    }

    public void setClassName(String className) {
        ClassName = className;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getCheckouttime() {
        return checkouttime;
    }

    public void setCheckouttime(String checkouttime) {
        this.checkouttime = checkouttime;
    }

    public String getTrainerName() {
        return TrainerName;
    }

    public void setTrainerName(String trainerName) {
        TrainerName = trainerName;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "ClassScheduleMC{" +
                "Capacity=" + Capacity +
                ", Status='" + Status + '\'' +
                ", ClassName='" + ClassName + '\'' +
                ", TrainerName='" + TrainerName + '\'' +
                ", checkouttime='" + checkouttime + '\'' +
                ", EndTime='" + EndTime + '\'' +
                ", StartTime='" + StartTime + '\'' +
                ", Date=" + Date +
                '}';
    }
}
