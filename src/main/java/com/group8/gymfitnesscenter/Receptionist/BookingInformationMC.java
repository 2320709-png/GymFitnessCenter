package com.group8.gymfitnesscenter.Receptionist;

import java.time.LocalDate;

public class BookingInformationMC {
    private Integer BookingID;
    private Integer MemberID;
    private String MemberName;
    private String Trainer;
    private LocalDate RequestedDate;
    private String Status;

    public BookingInformationMC(Integer bookingID, LocalDate requestedDate, String trainer, String memberName, Integer memberID, String status) {
        BookingID = bookingID;
        RequestedDate = requestedDate;
        Trainer = trainer;
        MemberName = memberName;
        MemberID = memberID;
        Status = status;
    }

    public Integer getBookingID() {
        return BookingID;
    }

    public void setBookingID(Integer bookingID) {
        BookingID = bookingID;
    }

    public Integer getMemberID() {
        return MemberID;
    }

    public void setMemberID(Integer memberID) {
        MemberID = memberID;
    }

    public String getMemberName() {
        return MemberName;
    }

    public void setMemberName(String memberName) {
        MemberName = memberName;
    }

    public String getTrainer() {
        return Trainer;
    }

    public void setTrainer(String trainer) {
        Trainer = trainer;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public LocalDate getRequestedDate() {
        return RequestedDate;
    }

    public void setRequestedDate(LocalDate requestedDate) {
        RequestedDate = requestedDate;
    }

    @Override
    public String toString() {
        return "BookingInformationMC{" +
                "BookingID=" + BookingID +
                ", MemberID=" + MemberID +
                ", MemberName='" + MemberName + '\'' +
                ", Trainer='" + Trainer + '\'' +
                ", RequestedDate=" + RequestedDate +
                ", Status='" + Status + '\'' +
                '}';
    }
}
