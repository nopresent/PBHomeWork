package com.pb.naumenko_da.hw7;

import com.pb.naumenko_da.hw7.abstractz.Clothes;
import com.pb.naumenko_da.hw7.abstractz.Size;
import com.pb.naumenko_da.hw7.clothes.Pants;
import com.pb.naumenko_da.hw7.clothes.Skirt;
import com.pb.naumenko_da.hw7.clothes.Tie;
import com.pb.naumenko_da.hw7.clothes.Tshirt;
import com.pb.naumenko_da.hw7.interfaces.ManClothes;
import com.pb.naumenko_da.hw7.interfaces.WomenClothes;

import java.math.BigDecimal;

public class Atelier {
    public static void main(String[] args) {

        Clothes[] clothes = {
                new Tshirt("Supreme CDG",Size.XXS,new BigDecimal("300.5"),"Красный"),
                new Pants("Levis 505 Limited Edition",Size.L,new BigDecimal("560.23"),"Синий"),
                new Skirt("Versace, Elizabeth Jane Hurley", Size.XS, new BigDecimal(8457.124), "Pear Sunset"),
                new Tie("Satya Paul Design Studio", Size.M, new BigDecimal(220_000.103), "Сarrot juice")
        };

        dressMan(clothes);
        dressWomen(clothes);

    }

    public static void dressMan (Clothes[] clothes) {
        for (Clothes clothe : clothes) {
            if (clothe instanceof ManClothes) {
                System.out.print(((ManClothes) clothe).gender);
                ((ManClothes) clothe).dressMan();
            }
        }
    }

    public static void dressWomen (Clothes[] clothes) {
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothes) {
                System.out.print(((WomenClothes) clothe).gender);
                ((WomenClothes) clothe).dressWomen();
            }
        }
    }


}
