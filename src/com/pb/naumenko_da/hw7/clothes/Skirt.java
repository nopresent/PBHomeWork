package com.pb.naumenko_da.hw7.clothes;

import com.pb.naumenko_da.hw7.abstractz.Clothes;
import com.pb.naumenko_da.hw7.abstractz.Size;
import com.pb.naumenko_da.hw7.interfaces.WomenClothes;

import java.math.BigDecimal;

public class Skirt extends Clothes implements WomenClothes {

    private String name;
    private String top = " одежда -> Юбка: ";

    public Skirt(String name, Size size, BigDecimal price, String color) {
        super(size, price, color);
        this.name = name;
    }

    @Override
    public void dressWomen() {
        System.out.println(top + name + ", " + getSize().getEuroSize() + ", цвет: " + getColor() + ", цена: " + getPrice());
    }
}
