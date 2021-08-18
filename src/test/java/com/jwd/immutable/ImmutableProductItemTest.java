package com.jwd.immutable;

import com.jwd.date.Date;
import com.jwd.main.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class ImmutableProductItemTest {
    private ImmutableProductItem productItem;

    @Before
    public void before() {
        productItem = Main.initialization();
    }

    @Test
    void getType() {
        before();
        String localTypeNotModified = productItem.getType();
        String localTypeModified = productItem.getType();
        localTypeModified += "+";
        Assert.assertEquals(localTypeNotModified, productItem.getType());
    }

    @Test
    void getPurchaseDate() {
        before();
        Date purchaseDateNotModified = productItem.getPurchaseDate();
        Date purchaseDateModified = productItem.getPurchaseDate();
        purchaseDateModified.setYear(1999);
        Assert.assertEquals(purchaseDateNotModified.getMonth(), productItem.getPurchaseDate().getMonth());
        Assert.assertEquals(purchaseDateNotModified.getYear(), productItem.getPurchaseDate().getYear());
    }

    @Test
    void getProductionDateAndBestBefore() {
        before();
        Date[] dateNotModified = new Date[2];
        Date[] dateModified = new Date[2];

        dateNotModified = productItem.getProductionDateAndBestBefore();
        dateModified = productItem.getProductionDateAndBestBefore();

        dateModified[0] = new Date(3, 0);
        Assertions.assertEquals(dateNotModified[0].getMonth(), productItem.getProductionDateAndBestBefore()[0].getMonth());
        Assertions.assertEquals(dateNotModified[0].getYear(), productItem.getProductionDateAndBestBefore()[0].getYear());
    }

    @Test
    void getCode() {
        before();
        int[] codeNotModified = new int[2];
        int[] codeModified = new int[2];

        codeNotModified = productItem.getCode();
        codeModified = productItem.getCode();

        codeModified[0] = 3;
        codeModified[1] = 5;

        Assertions.assertEquals(codeNotModified[0], productItem.getCode()[0]);
        Assertions.assertEquals(codeNotModified[1], productItem.getCode()[1]);

    }

}