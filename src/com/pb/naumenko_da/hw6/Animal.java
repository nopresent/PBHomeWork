package com.pb.naumenko_da.hw6;

abstract class Animal {
    private String name;
    private String food;
    private String location;

    public Animal(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public String getLocation() {
        return location;
    }

    public void makeNoise () {

    }

    public void eat() {

    }

    static void sleep() {
        System.out.println("Зверушка спит!");
    }

}
