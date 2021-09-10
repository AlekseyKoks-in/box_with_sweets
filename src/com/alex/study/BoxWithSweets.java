package com.alex.study;

import java.util.ArrayList;
import java.util.List;

public class BoxWithSweets implements ToSweets {

    private static List<TheSweet> sweets = new ArrayList<>();

    @Override
    public void addTheSweet(TheSweet theSweet) {
        sweets.add(theSweet);
    }

    @Override
    public void removeTheSweet(int index) {
        sweets.remove(index);
    }

    @Override
    public void removeTheSweet() {
        sweets.remove(sweets.size() - 1);
    }

    @Override
    public void printWeight() {
        double boxWeight = 0;
        for (TheSweet theSweet : sweets) {
            boxWeight += theSweet.getWeight();
        }
        System.out.printf("Box weight = %.3f\n", boxWeight);
    }

    @Override
    public void printPrice() {
        double boxPrice = 0;
        for (TheSweet theSweet : sweets) {
            boxPrice += theSweet.getPrice();
        }
        System.out.printf("Box price = %.2f\n", boxPrice);
    }

    @Override
    public void informationAboutAllSweets() {
        for (TheSweet theSweet : sweets) {
            theSweet.printAllInformation();
        }
    }
}
