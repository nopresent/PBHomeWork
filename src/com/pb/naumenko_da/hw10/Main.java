package com.pb.naumenko_da.hw10;

public class Main {
    public static void main(String[] args) {

        NumBox numBox = new NumBox(10);

        numBox.add(5);
        numBox.add(8);
        numBox.add(6);
        numBox.add(7);

        System.out.println("Массив integer: " + numBox);
        System.out.println("Получили елемент с индексом 3: " + numBox.get(3));
        System.out.println("Длинна массива: " + numBox.length());
        System.out.println("Среднее арифметическое: " + numBox.average());
        System.out.println("Сумма всех елментов: " + numBox.sum());
        System.out.println("Максимальный елемент: " + numBox.max());

        System.out.println("****************************************");

        NumBox numBox1 = new NumBox(10);

        numBox1.add(10.100500);
        numBox1.add(5.7878787);
        numBox1.add(8.00092);
        numBox1.add(6.12);
        numBox1.add(7.11);

        System.out.println("Массив double: " + numBox1);
        System.out.println("Получили елемент с индексом 3: " + numBox1.get(3));
        System.out.println("Длинна массива: " + numBox1.length());
        System.out.println("Среднее арифметическое: " + numBox1.average());
        System.out.println("Сумма всех елментов: " + numBox1.sum());
        System.out.println("Максимальный елемент: " + numBox1.max());


    }
}
