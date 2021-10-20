package com.pb.naumenko_da.hw3;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        int[] arrayList = new int[10];
        int elementSum = 0;
        int positiveElementCount = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Укажите 10 целых чисел.");
        for (int i = 0; i < arrayList.length; i++) {
            System.out.print("Елемент " + (i + 1) + ": ");
            arrayList[i] = scan.nextInt();
        }

        System.out.print("Вывести на экран введенный массив:");
        print(arrayList);

        for (int k : arrayList) {
            elementSum += k;
            if (k > 0) {
                positiveElementCount++;
            }
        }
        System.out.println("Сумма введеных чисел: " + elementSum);
        System.out.println("Кол-во положительных чисел: " + positiveElementCount);

        int count = arrayList.length;
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (arrayList[j] > arrayList[j + 1]) {
                    int temp = arrayList[j];
                    arrayList[j] = arrayList[j + 1];
                    arrayList[j + 1] = temp;
                }
            }
        }

        System.out.print("Массив отсортирован методом \"Bubble_sort\": ");
        print(arrayList);

    }

    static void print(int[] arrayList) {

        System.out.print("[");
        for (int i = 0; i < arrayList.length; i++) {
            System.out.print(arrayList[i]);
            if (i != arrayList.length - 1) System.out.print(",");
        }
        System.out.println("]");

    }

}


