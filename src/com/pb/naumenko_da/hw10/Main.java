package com.pb.naumenko_da.hw10;

public class Main {
    public static void main(String[] args) {

        NumBox<Integer> numBox = new NumBox(10);

        numBox.add(5);
        numBox.add(8);
        numBox.add(6);
        numBox.add(7);

        System.out.println("Массив Integer: " + numBox);
        System.out.println("Получили елемент с индексом 3: " + numBox.get(3));
        System.out.println("Длинна массива: " + numBox.length());
        System.out.println("Среднее арифметическое: " + numBox.average());
        System.out.println("Сумма всех елментов: " + numBox.sum());
        System.out.println("Максимальный елемент: " + numBox.max());

        System.out.println("****************************************");

        NumBox<Float> numBox1 = new NumBox(10);

        numBox1.add(5.7878787f);
        numBox1.add(8.00092f);
        numBox1.add(10.100500f);
        numBox1.add(6.12f);
        numBox1.add(7.11f);

        System.out.println("Массив Float: " + numBox1);
        System.out.println("Получили елемент с индексом 3: " + numBox1.get(3));
        System.out.println("Длинна массива: " + numBox1.length());
        System.out.println("Среднее арифметическое: " + numBox1.average());
        System.out.println("Сумма всех елментов: " + numBox1.sum());
        System.out.println("Максимальный елемент: " + numBox1.max());

        System.out.println("****************************************");

        NumBox<Integer> numBox2 = new NumBox(2);
        System.out.println("В случае если массив полон - выбросить исключение.");
        System.out.println("Создали массив на 2 елемента, пробуем положить в него 3 елемента");

        numBox2.add(1);
        numBox2.add(2);
        numBox2.add(3);

    }
}
