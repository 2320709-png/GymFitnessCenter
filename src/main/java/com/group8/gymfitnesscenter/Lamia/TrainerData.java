package com.group8.gymfitnesscenter.Lamia.Trainer;

import java.util.ArrayList;
import java.util.List;

public class TrainerData {


    private static String trainerID;
    private static String name;
    private static String email;
    private static String phone;
    private static String password;
    private static String qualification;


    private static List<String> availableDays = new ArrayList<>();
    private static List<String> availableSlots = new ArrayList<>();


    private static List<String> assignedMemberIDs = new ArrayList<>();
    private static List<String> memberProgressNotes = new ArrayList<>();


    private static List<String> classIDs = new ArrayList<>();
    private static List<Integer> classCapacities = new ArrayList<>();
    private static List<List<String>> classBookings = new ArrayList<>(); // each index corresponds to classIDs


    private static List<String> feedbackMemberIDs = new ArrayList<>();
    private static List<String> feedbackNotes = new ArrayList<>();


    public static void setTrainerID(String id) { trainerID = id; }
    public static String getTrainerID() { return trainerID; }

    public static void setName(String n) { name = n; }
    public static String getName() { return name; }

    public static void setEmail(String e) { email = e; }
    public static String getEmail() { return email; }

    public static void setPhone(String p) { phone = p; }
    public static String getPhone() { return phone; }

    public static void setPassword(String pw) { password = pw; }
    public static String getPassword() { return password; }

    public static void setQualification(String q) { qualification = q; }
    public static String getQualification() { return qualification; }


    public static void addAvailableDay(String day) { availableDays.add(day); }
    public static List<String> getAvailableDays() { return availableDays; }

    public static void addAvailableSlot(String slot) { availableSlots.add(slot); }
    public static List<String> getAvailableSlots() { return availableSlots; }


    public static void addAssignedMember(String memberID) {
        assignedMemberIDs.add(memberID);
        memberProgressNotes.add(""); // initialize empty progress
    }

    public static void updateMemberProgress(String memberID, String notes) {
        int index = assignedMemberIDs.indexOf(memberID);
        if (index != -1) {
            memberProgressNotes.set(index, notes);
        }
    }

    public static String getMemberProgress(String memberID) {
        int index = assignedMemberIDs.indexOf(memberID);
        if (index != -1) {
            return memberProgressNotes.get(index);
        }
        return "No progress";
    }


    public static void addClass(String classID, int capacity) {
        classIDs.add(classID);
        classCapacities.add(capacity);
        classBookings.add(new ArrayList<>());
    }

    public static void bookMemberToClass(String classID, String memberID) {
        int index = classIDs.indexOf(classID);
        if (index != -1) {
            classBookings.get(index).add(memberID);
        }
    }

    public static int getClassCapacity(String classID) {
        int index = classIDs.indexOf(classID);
        if (index != -1) return classCapacities.get(index);
        return 0;
    }

    public static List<String> getClassBookings(String classID) {
        int index = classIDs.indexOf(classID);
        if (index != -1) return classBookings.get(index);
        return new ArrayList<>();
    }


    public static void addFeedback(String memberID, String notes) {
        feedbackMemberIDs.add(memberID);
        feedbackNotes.add(notes);
    }

    public static String getFeedback(String memberID) {
        int index = feedbackMemberIDs.indexOf(memberID);
        if (index != -1) return feedbackNotes.get(index);
        return "No feedback";
    }


    public static boolean isValid() {
        return name != null && !name.isEmpty()
                && email != null && !email.isEmpty()
                && password != null && !password.isEmpty()
                && qualification != null && !qualification.isEmpty();
    }

    public static boolean saveProfile() {
        if (trainerID == null || trainerID.isEmpty()) {
            trainerID = "TR" + System.currentTimeMillis();
        }
        return isValid();
    }
}
