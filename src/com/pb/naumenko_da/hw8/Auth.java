package com.pb.naumenko_da.hw8;

import com.pb.naumenko_da.hw8.exception.WrongLoginException;
import com.pb.naumenko_da.hw8.exception.WrongPasswordException;

public class Auth {
    private String login;
    private String password;
    private String errorReg = "не пройдена! Попробуйте еще раз. \n";
    private String errorIn = "Извините, указанного пользователя не существует!";

    public void signUp(String login, String password, String confirmPassword) throws WrongLoginException, WrongPasswordException {
        System.out.print("Регистрация ");

        if (!login.matches("[a-zA-Z0-9]{5,20}")) {
            System.out.println(errorReg + " -> Логин должен быть от 5 до 20 символов \n" +
                    " -> Разрешены латинские буквы и цифры");
            throw new WrongLoginException("Логин пользователя не удовлетворяет требованиям");
        }

        if (!password.matches("[a-zA-Z0-9_]{6,}")) {
            System.out.println(errorReg + " -> Длинна пароля должна быть более 5 \n" +
                    " -> Разрешены латинские буквы и цифры, а так же знак подчеркивания");
            throw new WrongPasswordException("Пароль пользователя не удовлетворяет требованиям");
        }

        if (!password.equals(confirmPassword)) {
            System.out.println(errorReg + " -> Пароли не совпадают!");
            throw new WrongPasswordException("Пароль пользователя не удовлетворяет требованиям");
        }

        this.login = login;
        this.password = password;

        System.out.println("пройдена успешно!");
    }

    public void signin(String login, String password) throws WrongLoginException {

        if (!login.equals(this.login)) {
            System.out.println(errorIn);
            throw new WrongLoginException();
        }

        if (!password.equals(this.password)) {
            System.out.println(errorIn);
            throw new WrongLoginException();
        }

        System.out.println("Добрый день, "+login + ". Как сегодня будем тратить деньги? )");
    }

}
