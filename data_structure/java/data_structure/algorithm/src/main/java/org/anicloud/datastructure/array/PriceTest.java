package org.anicloud.datastructure.array;

/**
 * Created by zhaoyu on 15-7-19.
 */
class Price {
    final static Price INSTANCE = new Price(2.8);

    static double initPrice = 20;
    double currentPrice;

    public Price(double discount) {
        currentPrice = initPrice -discount;
    }
}

public class PriceTest {
    public static void main(String[] args) {
        System.out.println(Price.INSTANCE.currentPrice);

        Price p = new Price(2.8);
        System.out.println(p.currentPrice);
    }
}
