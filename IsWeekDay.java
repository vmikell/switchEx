package com.company;

import java.util.Scanner;

public class IsWeekDay {

    public static void main(String[] args) {
        String day;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day of the week to find out if it is a weekday:");
        day = sc.next();

        System.out.println(isWeekDay(day));

    }
        private static boolean isWeekDay(String day){
            switch(day){
                case "Monday" :
                case "Tuesday" :
                case "Wednesday" :
                case "Thursday" :
                case "Friday" : return true;
            }
        return false;
        }
    }

