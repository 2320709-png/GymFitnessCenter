package com.group8.gymfitnesscenter.Lamia.Member;

import java.util.ArrayList;

public class BookingManager {

    // Shared booked classes list
    public static ArrayList<String> bookedClasses = new ArrayList<>();

    public static void addBooking(String booking) {
        bookedClasses.add(booking);
    }

    public static void removeBooking(String booking) {
        bookedClasses.remove(booking);
    }

    public static ArrayList<String> getBookings() {
        return bookedClasses;
    }
}
