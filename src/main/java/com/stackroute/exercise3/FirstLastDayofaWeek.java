package com.stackroute.exercise3;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class FirstLastDayofaWeek {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        // Go backward to get Monday
        LocalDate monday = today;
        while (monday.getDayOfWeek() != DayOfWeek.MONDAY) {
            monday = monday.minusDays(1);
        }

        // Go forward to get Sunday
        LocalDate sunday = today;
        while (sunday.getDayOfWeek() != DayOfWeek.SUNDAY) {
            sunday = sunday.plusDays(1);
        }

        System.out.println("Today: " + today);
        System.out.println("First Day of the Week: " + monday);
        System.out.println("Last Day of the Week: " + sunday);
    }
}
