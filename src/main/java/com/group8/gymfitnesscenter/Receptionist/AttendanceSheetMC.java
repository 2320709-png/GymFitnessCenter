package com.group8.gymfitnesscenter.Receptionist;

import java.time.LocalDate;

public class AttendanceSheetMC {
    private Integer RecordId;
    private Integer MemberId;
    private String Membername;
    private String Checkintime;
    private String checkouttime;
    private String ProcessedBy;
    private String Totalduration;
    private LocalDate Date;


    public AttendanceSheetMC(Integer recordId, String membername, Integer memberId, String checkintime, String checkouttime, String processedBy, String totalduration, LocalDate date) {
        RecordId = recordId;
        Membername = membername;
        MemberId = memberId;
        Checkintime = checkintime;
        this.checkouttime = checkouttime;
        ProcessedBy = processedBy;
        Totalduration = totalduration;
        Date = date;
    }

    public Integer getRecordId() {
        return RecordId;
    }

    public void setRecordId(Integer recordId) {
        RecordId = recordId;
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

    public String getCheckintime() {
        return Checkintime;
    }

    public void setCheckintime(String checkintime) {
        Checkintime = checkintime;
    }

    public String getCheckouttime() {
        return checkouttime;
    }

    public void setCheckouttime(String checkouttime) {
        this.checkouttime = checkouttime;
    }

    public String getProcessedBy() {
        return ProcessedBy;
    }

    public void setProcessedBy(String processedBy) {
        ProcessedBy = processedBy;
    }

    public String getTotalduration() {
        return Totalduration;
    }

    public void setTotalduration(String totalduration) {
        Totalduration = totalduration;
    }

    public LocalDate getDate() {
        return Date;
    }

    public void setDate(LocalDate date) {
        Date = date;
    }

    @Override
    public String toString() {
        return "AttendanceSheetMC{" +
                "RecordId=" + RecordId +
                ", MemberId=" + MemberId +
                ", Membername='" + Membername + '\'' +
                ", Checkintime='" + Checkintime + '\'' +
                ", checkouttime='" + checkouttime + '\'' +
                ", ProcessedBy='" + ProcessedBy + '\'' +
                ", Totalduration='" + Totalduration + '\'' +
                ", Date=" + Date +
                '}';
    }
}
