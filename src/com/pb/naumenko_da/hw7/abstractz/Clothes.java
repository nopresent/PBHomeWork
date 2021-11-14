package com.pb.naumenko_da.hw7.abstractz;

import java.math.BigDecimal;

abstract public class Clothes {
    private Size size;
    private BigDecimal price;
    private String color;

    public Clothes(Size size, BigDecimal price, String color) {
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

}
