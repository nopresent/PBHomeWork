package com.pb.naumenko_da.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int userInt;

        System.out.print("Введите целое число: ");
        userInt = scan.nextInt();

        if (userInt > 100 || userInt < 0 || userInt == -0) {
            System.out.println("Введенное число не входит в диапазоны [0-14] [15-35] [36-50] [51-100].");
        } else if (userInt >= 51) {
            System.out.println("Введенное число из диапазона [51-100].");
        } else if (userInt >= 36) {
            System.out.println("Введенное число из диапазона [36-50].");
        } else if (userInt >= 15) {
            System.out.println("Введенное число из диапазона [15-35].");
        } else {
            System.out.println("Введенное число из диапазона [0-14].");
        }

    }
}
