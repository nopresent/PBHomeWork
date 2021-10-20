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

        System.out.print("Вывести на экран введенный массив:[");
        for (int i = 0; i < arrayList.length; i++) {
            elementSum += arrayList[i];
            if (arrayList[i] > 0) {
                positiveElementCount++;
            }
            System.out.print(arrayList[i]);
            if (i != arrayList.length - 1) System.out.print(",");
        }
        System.out.println("]");

        System.out.println("Сумма введеных чисел: " + elementSum);
        System.out.println("Кол-во положительных чисел: " + positiveElementCount);


    }

}
