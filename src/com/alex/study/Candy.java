package com.alex.study;

public class Candy extends TheSweet{

    public Candy(String name, double weight, double price) {
        setName(name);
        setWeight(weight);
        setPrice(price);
    }

    @Override
    public String toString() {
        return String.format("%s, weight = %.2f, price = %.2f",
                getName(), getWeight(), getPrice());
    }

    @Override
    public void printAllInformation() {
        System.out.println(this);
    }
}
