package com.anthony;

import java.util.Scanner;

public class Main {
    // Scanners
    static Scanner stringScanner = new Scanner(System.in);
    static Scanner numberScanner = new Scanner(System.in);

    public static void main(String[] args) {

        // Create variables and constants
        double DISTANCE_TOTAL = 26.2;
        double distance = 1.0;
        int weekNum = 1;
        double percentage = 0.01;

        // 1% increase each week
        weeklySchedule(DISTANCE_TOTAL, distance, weekNum, percentage);
        // 5% increase each week
        percentage = 0.05;
        weeklySchedule(DISTANCE_TOTAL, distance, weekNum, percentage);
        // 10% increase each week
        percentage = 0.10;
        weeklySchedule(DISTANCE_TOTAL, distance, weekNum, percentage);

        // Close scanners
        stringScanner.close();
        numberScanner.close();
    }

    private static void weeklySchedule(double DISTANCE_TOTAL, double distance, int weekNum, double percentage) {
        // While loop to loop through each week the user would run
        while (distance <= DISTANCE_TOTAL) {
            // Calculate teh distance traveled this week
            distance = distance + distance * percentage;
            // Increment the week number
            weekNum++;
//            System.out.print("Weeknumber: " + weekNum);
//            System.out.println(String.format(" Distance run: %.2f", distance));

        }
        System.out.println("It will take " + weekNum + " weeks to reach your goal of " + DISTANCE_TOTAL + " miles");
        System.out.println(String.format("Distance run: %.2f",  distance));
    }

}
