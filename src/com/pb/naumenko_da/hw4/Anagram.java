package com.pb.naumenko_da.hw4;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {

        String userInputString1;
        String userInputString2;
        Scanner scan = new Scanner(System.in);

        System.out.println("Является ли СТРОКА1 анаграммой СТРОКИ2?");
        System.out.println("Введите СТРОКА1. Например: Я в мире — сирота");
        userInputString1 = scan.nextLine();

        System.out.println("Введите СТРОКА2. Например: Я в Риме — Ариост");
        userInputString2 = scan.nextLine();

        if (getFormattedString(userInputString1).equals(getFormattedString(userInputString2))) {
            System.out.println("Введенные строки являются Анаграммой!");
        } else {
            System.out.println("Это не Анаграмма!");
        }
    }

    static String getFormattedString(String string) {

        String[] array = new String[string.length()];
        String outString = "";
        String blank = "blank"; // подмениваем все что не буква на это

        for (int i = 0; i < array.length; i++) {
            if (string.substring(i, i + 1).matches("[а-яА-Яa-zA-Z]")) {
                array[i] = string.substring(i, i + 1).toLowerCase();
            } else {
                array[i] = blank;
            }
        }

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != blank) {
                outString += array[i];
            }
        }

        return outString;
    }


}
