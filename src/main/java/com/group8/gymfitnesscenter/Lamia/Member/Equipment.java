package com.group8.gymfitnesscenter.Lamia.Member;

public class Equipment {

    private String name;
    private String status;
    private String usageTime;

    public Equipment(String name, String status, String usageTime) {
        this.name = name;
        this.status = status;
        this.usageTime = usageTime;
    }

    public String getName() { return name; }
    public String getStatus() { return status; }
    public String getUsageTime() { return usageTime; }

    public void setStatus(String status) { this.status = status; }
    public void setUsageTime(String usageTime) { this.usageTime = usageTime; }
}
