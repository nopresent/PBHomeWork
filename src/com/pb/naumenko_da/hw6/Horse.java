package com.pb.naumenko_da.hw6;

import java.util.Objects;

public class Horse extends Animal{

    private boolean isPlow;

    public Horse(String name, String food, String location, boolean isPlow) {
        super(name, food, location);
        this.isPlow = isPlow;
    }

    public void makeNoise () {
        System.out.println("Иииии-гого!");
    }

    public void eat () {
        System.out.println("Не трожь "+getFood()+"!");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return Objects.equals(getName(), horse.getName()) &&
                Objects.equals(getFood(), horse.getFood()) &&
                 isPlow == horse.isPlow;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(),getFood(),isPlow);
    }

    @Override
    public String toString() {
        String str = " и может работать с плугом!";
        if (!isPlow) str = " и не навидит работу в поле!";
        return "Лошадь " + getName() + " проживает в " +  getLocation() + str;
    }


}
