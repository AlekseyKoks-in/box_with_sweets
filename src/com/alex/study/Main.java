package com.alex.study;

public class Main {

    public static void main(String[] args) {
        BoxWithSweets b1 = new BoxWithSweets("box1", 1, 1);
        b1.addTheSweet(new Candy("candy1", 13.5, 130));
        b1.addTheSweet(new Candy("candy2", 11.5, 110));
        b1.addTheSweet(new Chocolate("chocolate1", 10.5, 120));
        b1.addTheSweet(new Chocolate("chocolate2", 12.5, 140));

        b1.printPrice();
        b1.printWeight();
        System.out.println();

        b1.informationAboutAllSweets();
        System.out.println();


        b1.removeMinimalWeight(30);
//        b1.removeMinimalPrice(30);
        b1.informationAboutAllSweets();

    }
}
