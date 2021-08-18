package com.jwd.immutable;

import com.jwd.date.Date;

public final class ImmutableProductItem {
    private final int cost;
    private final int[] code;
    private final String type;
    private final Date purchaseDate;
    private final Date[] productionDateAndBestBefore;

    public ImmutableProductItem(int cost, int[] code, String type, Date purchaseDate, Date[] productionDateAndBestBefore) {
        this.cost = cost;
        this.code = this.copyIntArray(code);
        this.type = type;
        this.purchaseDate = new Date(purchaseDate.getMonth(), purchaseDate.getYear());
        this.productionDateAndBestBefore = this.copyDateArray(productionDateAndBestBefore);
    }

    public int[] getCode() {
        int[] localCode = new int[this.code.length];

        for(int i = 0; i < this.code.length; ++i) {
            localCode[i] = this.code[i];
        }

        return localCode;
    }

    public String getType() {
        return this.type;
    }

    public Date getPurchaseDate() {
        Date localDate = new Date(this.purchaseDate.getMonth(), this.purchaseDate.getYear());
        return localDate;
    }

    public Date[] getProductionDateAndBestBefore() {
        Date[] localDateArray = new Date[this.productionDateAndBestBefore.length];

        for(int i = 0; i < this.productionDateAndBestBefore.length; ++i) {
            Date localDate = new Date(this.productionDateAndBestBefore[i]);
            localDateArray[i] = localDate;
        }

        return localDateArray;
    }

    public int getCost() {
        return this.cost;
    }

    private Date[] copyDateArray(Date[] localProductionDateAndBestBefore) {
        Date[] localDateArray = new Date[localProductionDateAndBestBefore.length];

        for(int i = 0; i < localProductionDateAndBestBefore.length; ++i) {
            Date localDate = new Date(localProductionDateAndBestBefore[i]);
            localDateArray[i] = localDate;
        }

        return localDateArray;
    }

    private int[] copyIntArray(int[] code) {
        int[] localCode = new int[code.length];

        for(int i = 0; i < code.length; ++i) {
            localCode[i] = code[i];
        }

        return localCode;
    }
}
