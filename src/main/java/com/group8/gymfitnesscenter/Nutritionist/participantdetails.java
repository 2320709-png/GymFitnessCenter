package com.group8.gymfitnesscenter.Nutritionist;

import java.time.LocalDate;

public class participantdetails {
    private String ParticipantName;
    private Integer ParticipantID;

    public participantdetails(String participantName, Integer participantID) {
        ParticipantName = participantName;
        ParticipantID = participantID;
    }

    public String getParticipantName() {
        return ParticipantName;
    }

    public void setParticipantName(String participantName) {
        ParticipantName = participantName;
    }

    public Integer getParticipantID() {
        return ParticipantID;
    }

    public void setParticipantID(Integer participantID) {
        ParticipantID = participantID;
    }

    @Override
    public String toString() {
        return "participantdetails{" +
                "ParticipantName='" + ParticipantName + '\'' +
                ", ParticipantID=" + ParticipantID +
                '}';
    }
}

