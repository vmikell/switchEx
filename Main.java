package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int dayNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of day between 1 & 7:");
        dayNumber = sc.nextInt();

        System.out.println(determineNumberOfDay(dayNumber));
    }

        private static String determineNumberOfDay(int dayNumber) {
            String result = "";
            switch(dayNumber) {
                case 1 -> result = "Sunday";
                case 2 -> result = "Monday";
                case 3 -> result = "Tuesday";
                case 4 -> result = "Wednesday";
                case 5 -> result = "Thursday";
                case 6 -> result = "Friday";
                case 7 -> result = "Saturday";
                default -> System.out.println("There are only 7 days in a week");
            }
            return result;
        }
}


