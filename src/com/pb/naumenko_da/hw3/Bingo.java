package com.pb.naumenko_da.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {

        int userInput; // То что вводит пользователь
        int startCount = 0, endCout = 100; // период в котором пользователь отгадывает число
        int userCountTry = 1; // кол-во попыток юзера

        Random randome = new Random();
        int storeRnd = randome.nextInt(endCout + 1); // Рандомное число

        Scanner scan = new Scanner(System.in);
        System.out.println("********\n Bingo! Угадай Мело... Угадай Число от 0 до 100 \n********");

        while (userCountTry > 0) {

            System.out.print("Введите число от " + startCount + " до " + endCout + ": ");
            userInput = scan.nextInt();

            if (userInput > 100) {
                // Игра закончена, бла, бла, бла
                System.out.println("Спасибо за игру!");
                break;
            } else {

                if (storeRnd == userInput) {
                    System.out.print("Подздравляю, ты угадал загаднное мной число! ");
                    break;
                } else if (storeRnd > userInput) {
                    startCount = ++userInput;
                    if (check(startCount, endCout, storeRnd)) {
                        break;
                    } else {
                        System.out.println("Загаданное мной число больше");
                    }
                } else {
                    endCout = --userInput;
                    if (check(startCount, endCout, storeRnd)) {
                        break;
                    } else {
                        System.out.println("Загаданное мной число меньше");
                    }
                }

            }

            userCountTry++;

            if (userCountTry > 2) {
                System.out.println("******** Для выхода введите 911");
            } else {
                System.out.println("********");
            }
            System.out.println();

        }

        System.out.println("Кол-во использованных попыток " + userCountTry + " шт.");


    }

    public static boolean check(int startCount, int endCout, int storeRnd) {

        if (startCount == endCout) {
            System.out.println("Подздравляю, методом исключения ;-) ты угадал число " + storeRnd + "!");
            return true;
        }

        return false;
    }
}
