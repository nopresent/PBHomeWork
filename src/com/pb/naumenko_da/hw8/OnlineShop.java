package com.pb.naumenko_da.hw8;

import com.pb.naumenko_da.hw8.exception.WrongLoginException;
import com.pb.naumenko_da.hw8.exception.WrongPasswordException;

import java.util.Scanner;

public class OnlineShop {
    public static void main(String[] args) {

        String userLogin;
        String userPass;
        String userConfirmPass;
        Auth auth = new Auth();

        Scanner scan = new Scanner(System.in);

        /*
            Регистрируем юзера
         */
        boolean nxt = false;
        while (!nxt) {

            System.out.println("Для доступа к магазину необходимо пройти регистрацию!");
            // Получаем логин
            System.out.println("Введите логин:");
            userLogin = scan.nextLine();

            // Получаем пароль
            System.out.println("Введите пароль:");
            userPass = scan.nextLine();

            // Подтверждение пароля
            System.out.println("Подтвердите пароль:");
            userConfirmPass = scan.nextLine();

            // пробуем зарегистрировать пользователя
            try {
                auth.signUp(userLogin, userPass, userConfirmPass);
                nxt = true;
            } catch (WrongLoginException | WrongPasswordException e) {
                e.printStackTrace();
            }

        }


         /*
             Входим на сайт
         */
        System.out.println("*************************************************");

        nxt = false;
        while (!nxt) {
            System.out.println("Для доступа к магазину необходимо авторизоваться!");

            System.out.println("Введите логин:");
            userLogin = scan.nextLine();

            // Получаем пароль
            System.out.println("Введите пароль:");
            userPass = scan.nextLine();

            try {
                auth.signin(userLogin, userPass);
                nxt = true;
            } catch (WrongLoginException e) {
                e.printStackTrace();
            }

        }

    }
}
