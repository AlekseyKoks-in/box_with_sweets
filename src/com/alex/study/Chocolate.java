package com.alex.study;

public class Chocolate extends TheSweet{

    public Chocolate(String name, double weight, double price) {
        setName(name);
        setWeight(weight);
        setPrice(price);
    }

    @Override
    public String toString() {
        return String.format("%s, weight = %.2f, price = %.2f",
                this.getName(), this.getWeight(), this.getPrice());
    }

    @Override
    public void printAllInformation() {
        System.out.println(this);
    }
}
