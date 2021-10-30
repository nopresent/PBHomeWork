package com.pb.naumenko_da.hw4;

import java.util.Scanner;

public class CapitalLetter {
    public static void main(String[] args) {
        String userInputString;
        Scanner scan = new Scanner(System.in);

        System.out.println("Напишите немного о погоде! \nНапример: За !окном , осень ,хочется спать! :-)");
        userInputString = scan.nextLine();

        System.out.println(toCapitalLetter(userInputString));

    }

    static String toCapitalLetter(String string) {
        String[] subString = string.split(" ");
        StringBuilder returnString = new StringBuilder();

        for (int i = 0; i < subString.length; i++) {
            returnString.append(firstUpperCase(subString[i]));

            if (i != subString.length - 1) {
                returnString.append(" ");
            }
        }
        return returnString.toString();
    }

    static String firstUpperCase(String string) {
        StringBuilder outBody = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            if (string.substring(i, i + 1).matches("[а-яА-Яa-zA-Zі]")) {
                outBody.append(string.substring(i, i + 1).toUpperCase()).append(string.substring(i + 1));
                break;
            }
            outBody.append(string.substring(i, i + 1));
        }
        return outBody.toString();
    }
}

