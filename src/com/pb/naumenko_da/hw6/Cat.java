package com.pb.naumenko_da.hw6;

import java.util.Objects;

public class Cat extends Animal{

    private boolean isPurr;

    public Cat(String name, String food, String location, boolean isPurr) {
        super(name, food, location);
        this.isPurr = isPurr;
    }

    @Override
    public void makeNoise () {
        System.out.println("Мяяяяу!");
    }

    @Override
    public void eat () {
        System.out.println("Не трожь "+getFood()+"!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return Objects.equals(getName(), cat.getName()) &&
                Objects.equals(getFood(), cat.getFood()) &&
                Objects.equals(getLocation(), cat.getLocation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),getFood(),getLocation());
    }

    @Override
    public String toString() {
        String str = ", любимое занятие - мурлыкать!";
        if (!isPurr) str = "";
        return "Кошка " + getName() + " проживает в " +  getLocation() + str;

    }
}
