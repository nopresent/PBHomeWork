package com.pb.naumenko_da.hw6;

import java.lang.reflect.Constructor;

public class VetСlinic {
    public static void main(String[] args) throws Exception {

        // Создаем ветеринара
        // Veterinarian veterinarian = new Veterinarian();

        // Создаем ветеринара рефлексией
        Class<?> clazzVet = Class.forName("com.pb.naumenko_da.hw6.Veterinarian");
        Constructor<?> constructor = clazzVet.getConstructor(new Class[]{});
        Object obj = constructor.newInstance();

        Animal[] animal = {
                new Dog("Шарик", "кость", "дом N15", true),
                new Dog("Тузик", "мясо", "дом N1", false),
                new Cat("Василиса", "молоко", "дом N3", true),
                new Horse("Марсель", "сено", "дом N7", false)
        };

        System.out.println("Прием в вет. Клинике \n*******************************");
        for (Animal value : animal) {
            if (obj instanceof Veterinarian) {
                ((Veterinarian) obj).treatAnimal(value);
                System.out.print("Пошумим? -> ");
                value.makeNoise();
                System.out.println("*************");
            }
        }


    }
}
