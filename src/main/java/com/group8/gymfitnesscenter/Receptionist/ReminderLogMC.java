package com.group8.gymfitnesscenter.Receptionist;

import java.time.LocalDate;

public class ReminderLogMC {
    private Integer MemberID;
    private Integer LogID;
    private String Membername;
    private String Method;
    private String Status;
    private LocalDate ReminderDate;

    public ReminderLogMC(Integer memberID, String membername, Integer logID, String method, String status, LocalDate reminderDate) {
        MemberID = memberID;
        Membername = membername;
        LogID = logID;
        Method = method;
        Status = status;
        ReminderDate = reminderDate;
    }

    public Integer getMemberID() {
        return MemberID;
    }

    public void setMemberID(Integer memberID) {
        MemberID = memberID;
    }

    public Integer getLogID() {
        return LogID;
    }

    public void setLogID(Integer logID) {
        LogID = logID;
    }

    public String getMembername() {
        return Membername;
    }

    public void setMembername(String membername) {
        Membername = membername;
    }

    public String getMethod() {
        return Method;
    }

    public void setMethod(String method) {
        Method = method;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public LocalDate getReminderDate() {
        return ReminderDate;
    }

    public void setReminderDate(LocalDate reminderDate) {
        ReminderDate = reminderDate;
    }

    @Override
    public String toString() {
        return "ReminderLogMC{" +
                "MemberID=" + MemberID +
                ", LogID=" + LogID +
                ", Membername='" + Membername + '\'' +
                ", Method='" + Method + '\'' +
                ", Status='" + Status + '\'' +
                ", ReminderDate=" + ReminderDate +
                '}';
    }
}
