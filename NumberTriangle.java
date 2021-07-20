package com.company;

public class NumberTriangle<printNumberTriangle> {

    public static void main(String[] args) {

        System.out.println(printNumberTriangle());
    }

    public static String printNumberTriangle() {
        int n = 5;
        String end = "";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        return end;
    }
}
