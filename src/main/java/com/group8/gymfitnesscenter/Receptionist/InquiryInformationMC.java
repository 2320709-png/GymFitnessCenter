package com.group8.gymfitnesscenter.Receptionist;

import java.time.LocalDate;

public class InquiryInformationMC {
    private Integer InquiryID;
    private Integer MemberId;
    private String Membername;
    private String Category;
    private String Note;
    private String Status;
    private String Assignedto;
    private LocalDate DateofSubmission;

    public InquiryInformationMC(Integer inquiryID, Integer memberId, String membername, String category, String note, String assignedto, String status, LocalDate dateofSubmission) {
        InquiryID = inquiryID;
        MemberId = memberId;
        Membername = membername;
        Category = category;
        Note = note;
        Assignedto = assignedto;
        Status = status;
        DateofSubmission = dateofSubmission;
    }

    public Integer getInquiryID() {
        return InquiryID;
    }

    public void setInquiryID(Integer inquiryID) {
        InquiryID = inquiryID;
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

    public String getCategory() {
        return Category;
    }

    public void setCategory(String category) {
        Category = category;
    }

    public String getNote() {
        return Note;
    }

    public void setNote(String note) {
        Note = note;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getAssignedto() {
        return Assignedto;
    }

    public void setAssignedto(String assignedto) {
        Assignedto = assignedto;
    }

    public LocalDate getDateofSubmission() {
        return DateofSubmission;
    }

    public void setDateofSubmission(LocalDate dateofSubmission) {
        DateofSubmission = dateofSubmission;
    }

    @Override
    public String toString() {
        return "InquiryInformationMC{" +
                "InquiryID=" + InquiryID +
                ", MemberId=" + MemberId +
                ", Membername='" + Membername + '\'' +
                ", Category='" + Category + '\'' +
                ", Note='" + Note + '\'' +
                ", Status='" + Status + '\'' +
                ", Assignedto='" + Assignedto + '\'' +
                ", DateofSubmission=" + DateofSubmission +
                '}';
    }
}
