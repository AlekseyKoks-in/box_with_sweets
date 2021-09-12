package com.alex.study;

import java.util.*;

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
        System.out.printf("All information about %s:\n", getBoxName());
        for (TheSweet theSweet : sweets) {
            theSweet.printAllInformation();
        }
    }

    public double totalWeight() {
        double totalWeight = getBoxWeight();
        for (TheSweet theSweet : sweets) {
            totalWeight += theSweet.getWeight();
        }
        return totalWeight;
    }

    public void removeMinimalWeight(double limit) {
        Collections.sort(sweets, Comparator.comparingDouble(TheSweet::getWeight));
        limiter(limit);
    }

    public void removeMinimalPrice(double limit) {
        Collections.sort(sweets, Comparator.comparingDouble(TheSweet::getPrice));
        limiter(limit);
    }

    public void limiter(double limit) {
        double total = totalWeight();
        Iterator<TheSweet> iterator = sweets.iterator();
        while (iterator.hasNext()) {
            TheSweet s = iterator.next();
            if (limit < total) {
                total -= s.getWeight();
                iterator.remove();
            }
        }
    }

    Comparator<TheSweet> comparatorWeight = new Comparator<TheSweet>() {
        @Override
        public int compare(TheSweet s1, TheSweet s2) {
            return (int) (s1.getWeight() - s2.getWeight());
        }
    };

    Comparator<TheSweet> comparatorPrice = new Comparator<TheSweet>() {
        @Override
        public int compare(TheSweet s1, TheSweet s2) {
            return (int) (s1.getPrice() - s2.getPrice());
        }
    };
}
