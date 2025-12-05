package com.group8.gymfitnesscenter.Lamia.Member;

import java.time.LocalDate;
import java.util.UUID;

public class UserData {

    private static String name;
    private static int age;
    private static double weight;
    private static String membership;
    private static LocalDate lastCheckIn;

    private static String email;
    private static String phone;
    private static String password;   // NEW
    private static String memberID;   // Auto-generated



    public static void setName(String n) { name = n; }
    public static void setAge(int a) { age = a; }
    public static void setWeight(double w) { weight = w; }
    public static void setMembership(String m) { membership = m; }
    public static void setLastCheckIn(LocalDate date) { lastCheckIn = date; }
    public static void setEmail(String e) { email = e; }
    public static void setPhone(String p) { phone = p; }
    public static void setPassword(String pass) { password = pass; }



    public static String getName() { return name; }
    public static int getAge() { return age; }
    public static double getWeight() { return weight; }
    public static String getMembership() { return membership; }
    public static LocalDate getLastCheckIn() { return lastCheckIn; }
    public static String getEmail() { return email; }
    public static String getPhone() { return phone; }
    public static String getPassword() { return password; }
    public static String getMemberID() { return memberID; }



    public static boolean isValid() {

        if (name == null || name.trim().isEmpty()) return false;
        if (age <= 0) return false;
        if (weight <= 0) return false;
        if (email == null || !email.contains("@")) return false;
        if (phone == null || phone.length() < 6) return false;
        if (password == null || password.length() < 4) return false;

        return true;
    }



    public static boolean saveProfile() {
        if (!isValid()) return false;

        generateMemberID();
        return true;
    }



    private static void generateMemberID() {
        memberID = "GYM-" + UUID.randomUUID().toString().substring(0, 8).toUpperCase();
    }
}
