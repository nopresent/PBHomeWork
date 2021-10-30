package com.pb.naumenko_da.hw5;

import java.time.LocalDate;
import java.util.ArrayList;

public class Library {
    public static void main(String[] args) {

        // Наполняем библиотеку
        ArrayList<Book> bookList = new ArrayList();
        bookList.add(new Book("Приключения", "Горский И.И.", 2000));
        bookList.add(new Book("Словарь", "Кляузова А.В.", 1980));
        bookList.add(new Book("Энциклопедия", "Колывасов-Гейнсбург К.В.", 2012));

        System.out.println("---> Печатаем все книги в библиотеке: <---");
        for (Object o : bookList) {
            System.out.println(o);
        }
        System.out.println();

        // Заводим читателей
        ArrayList<Reader> readers = new ArrayList();
        readers.add(new Reader("Иванов И.И.", "Механический", "+38(012)345-67-89", LocalDate.of(1981, 4, 14)));
        readers.add(new Reader("Петров П.П.", "Экономический", "+38(098)765-43-21", LocalDate.of(1982, 5, 15)));
        readers.add(new Reader("Сидоров С.С.", "Строительный", "+38(098)123-43-21", LocalDate.of(1983, 6, 16)));

        System.out.println("---> Печатаем всех читателей в библиотеке: <---");
        for (Object o : readers) {
            System.out.println(o);
        }

        // Выдаем 3 книги
        System.out.println("---> Проверка методов takeBook/returnBook <----");
        readers.get(0).takeBook(3);
        // Возвращаем 2 книги
        readers.get(0).returnBook(2);
        System.out.println();

        // Выдаем 2 книги по названиям
        readers.get(1).takeBook(bookList.get(0).getName(), bookList.get(1).getName());
        // Возвращаем 2 книги по названиям
        readers.get(1).returnBook(bookList.get(1).getName(), bookList.get(2).getName());
        System.out.println();

        // Выдаем 3 книги, полное название
        readers.get(2).takeBook(bookList.get(0), bookList.get(1), bookList.get(2));
        // возвращаем 2 книги, полное название
        readers.get(2).returnBook(bookList.get(1), bookList.get(2));

    }
}
