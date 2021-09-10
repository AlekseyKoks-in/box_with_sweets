package com.alex.study;

import java.util.ArrayList;
import java.util.List;

public class BoxWithSweets implements ToSweets {

    private String boxName;
    private double boxWeight;
    private double boxPrice;

    public String getBoxName() {
        return this.boxName;
    }
    public double getBoxWeight() {
        return this.boxWeight;
    }
    public double getBoxPrice() {
        return this.boxPrice;
    }
    public void setBoxName(String boxName) {
        this.boxName = boxName;
    }
    public void setBoxWeight(double boxWeight) {
        this.boxWeight = boxWeight;
    }
    public void setBoxPrice(double boxPrice) {
        this.boxPrice = boxPrice;
    }

    public BoxWithSweets(String boxName, double boxWeight, double boxPrice) {
        setBoxName(boxName);
        setBoxWeight(boxWeight);
        setBoxPrice(boxPrice);
    }

    private List<TheSweet> sweets = new ArrayList<>();

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
        double totalWeight = getBoxWeight();
        for (TheSweet theSweet : sweets) {
            totalWeight += theSweet.getWeight();
        }
        System.out.printf("Box(%s) weight = %.3f\n", getBoxName(), totalWeight);
    }

    @Override
    public void printPrice() {
        double totalPrice = getBoxPrice();
        for (TheSweet theSweet : sweets) {
            totalPrice += theSweet.getPrice();
        }
        System.out.printf("Box(%s) price = %.2f\n", getBoxName(), totalPrice);
    }

    @Override
    public void informationAboutAllSweets() {
        for (TheSweet theSweet : sweets) {
            theSweet.printAllInformation();
        }
    }
}
