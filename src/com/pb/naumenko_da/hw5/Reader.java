package com.pb.naumenko_da.hw5;

import java.time.LocalDate;

public class Reader {
    private static Integer number = 0;

    private String fio, faculty, phoneNumber;
    private Integer libraryNumber;
    private LocalDate birthday;

    public Reader(String fio, String faculty, String phoneNumber, LocalDate birthday) {
        this.fio = fio;
        this.faculty = faculty;
        this.phoneNumber = phoneNumber;
        this.birthday = birthday;
        libraryNumber = ++number;
    }

    // Часть 1
    public void takeBook(Integer cnt) {
        takeReturnBook("взял", cnt);
    }

    public void returnBook(Integer cnt) {
        takeReturnBook("отдал", cnt);
    }

    private void takeReturnBook(String str, Integer cnt) {
        System.out.println(fio + " " + str + " " + cnt + " книги!");
    }

    // Часть 2
    public void takeBook(Book... book) {
        takeReturnBook("взял", book);
    }

    public void returnBook(Book... book) {
        takeReturnBook("отдал", book);
    }

    private void takeReturnBook(String str, Book... book) {
        System.out.print(fio + " " + str + " ");
        for (int i = 0; i < book.length; i++) {
            System.out.print(book[i]);
            if (i != book.length - 1) System.out.print(", ");
        }
        System.out.println();
    }

    // Часть 3
    public void takeBook(String... book) {
        takeReturnBook("взял", book);
    }

    public void returnBook(String... book) {
        takeReturnBook("отдал", book);
    }

    private void takeReturnBook(String str, String... book) {
         System.out.print(fio + " " + str + " ");
        for (int i = 0; i < book.length; i++) {
            System.out.print(book[i]);
            if (i != book.length - 1) System.out.print(", ");
        }
        System.out.println();
    }


}
