package com.group8.gymfitnesscenter.Receptionist;

import java.time.LocalDate;

public class AttendanceRecordMC {
    private Integer RecordId;
    private Integer MemberId;
    private String Membername;
    private Integer Phone;
    private LocalDate StartDate;
    private LocalDate EndDate;
    private String Lastcheckin;
    private String Lastcheckout;
    private String ProcessedBy;

    public AttendanceRecordMC(Integer recordId, String membername, Integer memberId, Integer phone, LocalDate startDate, LocalDate endDate, String lastcheckin, String lastcheckout, String processedBy) {
        RecordId = recordId;
        Membername = membername;
        MemberId = memberId;
        Phone = phone;
        StartDate = startDate;
        EndDate = endDate;
        Lastcheckin = lastcheckin;
        Lastcheckout = lastcheckout;
        ProcessedBy = processedBy;
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

    public Integer getPhone() {
        return Phone;
    }

    public void setPhone(Integer phone) {
        Phone = phone;
    }

    public LocalDate getStartDate() {
        return StartDate;
    }

    public void setStartDate(LocalDate startDate) {
        StartDate = startDate;
    }

    public LocalDate getEndDate() {
        return EndDate;
    }

    public void setEndDate(LocalDate endDate) {
        EndDate = endDate;
    }

    public String getLastcheckin() {
        return Lastcheckin;
    }

    public void setLastcheckin(String lastcheckin) {
        Lastcheckin = lastcheckin;
    }

    public String getLastcheckout() {
        return Lastcheckout;
    }

    public void setLastcheckout(String lastcheckout) {
        Lastcheckout = lastcheckout;
    }

    public String getProcessedBy() {
        return ProcessedBy;
    }

    public void setProcessedBy(String processedBy) {
        ProcessedBy = processedBy;
    }

    @Override
    public String toString() {
        return "AttendanceRecordMC{" +
                "RecordId=" + RecordId +
                ", MemberId=" + MemberId +
                ", Membername='" + Membername + '\'' +
                ", Phone=" + Phone +
                ", StartDate=" + StartDate +
                ", EndDate=" + EndDate +
                ", Lastcheckin='" + Lastcheckin + '\'' +
                ", Lastcheckout='" + Lastcheckout + '\'' +
                ", ProcessedBy='" + ProcessedBy + '\'' +
                '}';
    }
}
