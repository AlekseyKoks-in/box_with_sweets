package com.alex.study;

public class Main {

    public static void main(String[] args) {
        BoxWithSweets b1 = new BoxWithSweets();
        b1.addTheSweet(new Candy("candy1", 10.5, 100));
        b1.addTheSweet(new Candy("candy2", 11.5, 110));
        b1.addTheSweet(new Chocolate("chocolate1", 15.5, 150));
        b1.addTheSweet(new Chocolate("chocolate2", 16.5, 160));

        b1.printPrice();
        b1.printWeight();
        System.out.println();

        b1.informationAboutAllSweets();
        System.out.println();

        b1.removeTheSweet();
        b1.removeTheSweet(1);
        b1.informationAboutAllSweets();

    }
}
