package com.alex.study;

public abstract class TheSweet {

    private String name;
    private double weight;
    private double price;

    public String getName() {
        return this.name;
    }

    public double getWeight() {
        return this.weight;
    }

    public double getPrice() {
        return this.price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract void printAllInformation();

}
