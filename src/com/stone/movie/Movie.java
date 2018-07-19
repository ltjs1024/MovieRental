package com.stone.movie;

/**
 * 影片
 */
public class Movie {
    public static final int REGULAR = 0;
    public static final int CHILDRENS = 1;
    public static final int NEW_RELEASE = 2;

    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public String getTitle() {
        return title;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public double getCharge(int daysRented) {
        return 0;
    }

    public int getFrequentRenterPoints(int daysRented) {
        return 0;
    }
}
