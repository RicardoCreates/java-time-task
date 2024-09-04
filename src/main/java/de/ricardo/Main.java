package de.ricardo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        // Current Date and Time
        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime);

        // ADd Timespan of 2 Weeks
        LocalDateTime newDateTime = currentDateTime.plusWeeks(2);
        System.out.println("Date and Time after 2 weeks: " + newDateTime);

        // Future Date
        LocalDate specifiedDate = LocalDate.of(2025, 2, 1);
        if (currentDateTime.toLocalDate().isBefore(specifiedDate)) {
            System.out.println("The current date is before: " + specifiedDate);
        } else {
            System.out.println("The current date is after: " + specifiedDate);
        }

        // Difference between dates
        LocalDate startDate = LocalDate.of(2024, 1,1);
        LocalDate endDate = LocalDate.of(2024, 12, 31);
        long daysBetween = ChronoUnit.DAYS.between(startDate, endDate);
        System.out.println("Days between: " + startDate + " and " + endDate + " are: " + daysBetween);
    }
}