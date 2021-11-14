package com.pb.naumenko_da.hw7.abstractz;

public enum Size {
    XXS("Детский размер", 32),
    XS("Взрослый размер", 34),
    S("Взрослый размер", 36),
    M("Взрослый размер", 38),
    L("Взрослый размер", 40);

    private String title;
    private Integer size;

    Size(String title, int size) {
        this.size = size;
        this.title = title;
    }

    public String getDescription() {
        return title;
    }

    public Integer getEuroSize() {
        return this.size;
    }

}
