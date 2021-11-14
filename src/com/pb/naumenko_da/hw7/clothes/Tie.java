package com.pb.naumenko_da.hw7.clothes;

import com.pb.naumenko_da.hw7.abstractz.Clothes;
import com.pb.naumenko_da.hw7.abstractz.Size;
import com.pb.naumenko_da.hw7.interfaces.ManClothes;
import com.pb.naumenko_da.hw7.interfaces.WomenClothes;

import java.math.BigDecimal;

public class Tie extends Clothes implements ManClothes {

    private String name;
    private String top = " одежда -> Галстук: ";

    public Tie(String name, Size size, BigDecimal price, String color) {
        super(size, price, color);
        this.name = name;
    }

    @Override
    public void dressMan() {
        System.out.println(top + name + ", " + getSize().getDescription() + ", цвет: " + getColor() + ", цена: " + getPrice());
    }

}
