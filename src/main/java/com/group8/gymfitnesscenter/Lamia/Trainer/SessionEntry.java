package com.group8.gymfitnesscenter.Lamia.Trainer;

import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleStringProperty;

public class SessionEntry {
    private final SimpleStringProperty memberName;
    private final SimpleStringProperty day;
    private final SimpleStringProperty timeSlot;
    private final SimpleBooleanProperty attended;

    public SessionEntry(String memberName, String day, String timeSlot) {
        this.memberName = new SimpleStringProperty(memberName);
        this.day = new SimpleStringProperty(day);
        this.timeSlot = new SimpleStringProperty(timeSlot);
        this.attended = new SimpleBooleanProperty(false);
    }

    public String getMemberName() { return memberName.get(); }
    public String getDay() { return day.get(); }
    public String getTimeSlot() { return timeSlot.get(); }
    public boolean isAttended() { return attended.get(); }

    public void setAttended(boolean value) { attended.set(value); }

    public SimpleStringProperty memberNameProperty() { return memberName; }
    public SimpleStringProperty dayProperty() { return day; }
    public SimpleStringProperty timeSlotProperty() { return timeSlot; }
    public SimpleBooleanProperty attendedProperty() { return attended; }
}
