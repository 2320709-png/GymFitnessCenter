package com.group8.gymfitnesscenter.Receptionist;

import java.time.LocalDate;

public class ExpiryMemberMC {

    private Integer MemberId;
    private String Membername;
    private Integer Phone;
    private String Membershiplan;
    private LocalDate ExpiryDate;
    private String ReminderStatus;
    private LocalDate LastReminderDate;

    public ExpiryMemberMC(Integer memberId, String membername, Integer phone, String membershiplan, LocalDate expiryDate, String reminderStatus, LocalDate lastReminderDate) {
        MemberId = memberId;
        Membername = membername;
        Phone = phone;
        Membershiplan = membershiplan;
        ExpiryDate = expiryDate;
        ReminderStatus = reminderStatus;
        LastReminderDate = lastReminderDate;
    }

    public Integer getMemberId() {
        return MemberId;
    }

    public void setMemberId(Integer memberId) {
        MemberId = memberId;
    }

    public String getMembername() {
        return Membername;
    }

    public void setMembername(String membername) {
        Membername = membername;
    }

    public Integer getPhone() {
        return Phone;
    }

    public void setPhone(Integer phone) {
        Phone = phone;
    }

    public String getMembershiplan() {
        return Membershiplan;
    }

    public void setMembershiplan(String membershiplan) {
        Membershiplan = membershiplan;
    }

    public LocalDate getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        ExpiryDate = expiryDate;
    }

    public String getReminderStatus() {
        return ReminderStatus;
    }

    public void setReminderStatus(String reminderStatus) {
        ReminderStatus = reminderStatus;
    }

    public LocalDate getLastReminderDate() {
        return LastReminderDate;
    }

    public void setLastReminderDate(LocalDate lastReminderDate) {
        LastReminderDate = lastReminderDate;
    }

    @Override
    public String toString() {
        return "ExpiryMemberMC{" +
                "MemberId=" + MemberId +
                ", Membername='" + Membername + '\'' +
                ", Phone=" + Phone +
                ", Membershiplan='" + Membershiplan + '\'' +
                ", ExpiryDate=" + ExpiryDate +
                ", ReminderStatus='" + ReminderStatus + '\'' +
                ", LastReminderDate=" + LastReminderDate +
                '}';
    }
}
