package com.pb.naumenko_da.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int operand1, operand2;
        String sign;

        System.out.println("Программа \"Калькулятор\".");
        System.out.print("Введите целое число: ");
        operand1 = scan.nextInt();

        System.out.print("Что необходимо сделать? (+,-,*,/): ");
        sign = scan.next();

        System.out.print("Введите следующее целое число: ");
        operand2 = scan.nextInt();

        System.out.print("Результат: ");
        switch (sign) {
            case "-":
                System.out.println(operand1 - operand2);
                break;

            case "+":
                System.out.println(operand1 + operand2);
                break;

            case "*":
                System.out.println(operand1 * operand2);
                break;

            case "/":
                if (operand2 == 0) {
                    System.out.println("Only Сhuck Norris can divide by zero :-)");
                } else {
                    System.out.println((float) operand1 / operand2);
                }
                break;

            default:
                System.out.println("В настоящее время, данная операция не поддерживается! Maybe next time )");
                break;

        }

    }
}
