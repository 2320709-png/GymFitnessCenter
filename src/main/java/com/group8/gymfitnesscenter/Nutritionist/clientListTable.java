package com.group8.gymfitnesscenter.Nutritionist;

import java.time.LocalDate;

public class clientListTable {

    private Integer ClientID;

    private String ClientName;

    public clientListTable(Integer clientID, String clientName) {
        ClientID = clientID;
        ClientName = clientName;
    }

    public Integer getClientID() {
        return ClientID;
    }

    public void setClientID(Integer clientID) {
        ClientID = clientID;
    }

    public String getClientName() {
        return ClientName;
    }

    public void setClientName(String clientName) {
        ClientName = clientName;
    }

    @Override
    public String toString() {
        return "clientListTable{" +
                "ClientID=" + ClientID +
                ", ClientName='" + ClientName + '\'' +
                '}';
    }
}
