package com.jwd.main;

import com.jwd.date.Date;
import com.jwd.immutable.ImmutableProductItem;

import java.util.Arrays;

public class Main {

    public static ImmutableProductItem initialization() {
        Date productionDate = new Date(1,2021);
        Date bestBefore = new Date(2,2022);
        Date[] productionDateAndBestBefore = new Date[2];
        productionDateAndBestBefore[0] = productionDate;
        productionDateAndBestBefore[1] = bestBefore;

        int cost = 100;

        int [] code = new int[2];

        code[0] = 1;
        code[1] = 3;

        String type = new String("milk");

        Date purchaseDate = new Date(4,2021);

        return new ImmutableProductItem(cost, code, type, purchaseDate,productionDateAndBestBefore);
    }

    public static void main(String[] args) {
        ImmutableProductItem immutableProductItem =  initialization();
    }

}
