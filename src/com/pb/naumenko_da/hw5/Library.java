package com.pb.naumenko_da.hw5;

import java.time.LocalDate;

public class Library {
    public static void main(String[] args) {

        // Наполняем библиотеку
        Book book1 = new Book("Приключения", "Иванов И.И.", 2000);
        Book book2 = new Book("Словарь", "Сидоров А.В.", 1980);
        Book book3 = new Book("Энциклопедия", "Гусев К.В.", 2012);

        // Создаем читателя
        Reader reader1 = new Reader("Анонимов А.А.", "Механический ф-т", "+38(012)345-67-89", LocalDate.of(1981, 4, 14));
        Reader reader2 = new Reader("Кузнецов Б.Б.", "Экономический ф-т", "+38(098)765-43-21", LocalDate.of(1982, 5, 15));

        // Выдаем 3 книги
        reader1.takeBook(3);
        // Возвращаем 2 книги
        reader2.returnBook(2);
        System.out.println("*****************");

        // Выдаем 2 книги по названиям
        reader1.takeBook(book2.getName(), book3.getName());
        // Возвращаем 2 книги по названиям
        reader2.returnBook(book1.getName(), book3.getName());
        System.out.println("*****************");

        // Выдаем 3 книги, полное название
        reader1.takeBook(book1, book2, book3);
        // возвращаем 2 книги, полное название
        reader2.returnBook(book3, book1);

    }
}
