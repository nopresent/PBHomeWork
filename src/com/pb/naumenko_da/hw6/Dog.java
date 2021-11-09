package com.pb.naumenko_da.hw6;

import java.util.Objects;

public class Dog extends Animal{

    private boolean isGrowl;

    public Dog(String name, String food, String location, boolean isGrowl) {
        super(name, food, location);
        this.isGrowl = isGrowl;
    }

    @Override
    public void makeNoise () {
        System.out.println("Гав-гав-гав!");
    }

    @Override
    public void eat () {
        System.out.println("Не трожь "+getFood()+"!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return Objects.equals(getName(), dog.getName()) &&
                Objects.equals(getFood(), dog.getFood());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),getFood());
    }

    @Override
    public String toString() {
        String str = "умеет рычать";
        if (!isGrowl) str = "не " + str;
        return "Собака " + getName() + " живет в " +  getLocation() + ", предпочитает есть " + getFood() + " и " + str;
    }
}
