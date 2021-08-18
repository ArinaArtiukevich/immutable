package com.jwd.date;

public class Date {
    private int month;
    private int year;

    public Date(int month, int year) {
        this.month = month;
        this.year = year;
    }

    public Date(Date date) {
        this.month = date.getMonth();
        this.year = date.getYear();
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return "Date{month=" + this.month + ", year=" + this.year + "}";
    }
}
