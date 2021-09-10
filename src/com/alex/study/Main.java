package com.alex.study;

public class Main {

    public static void main(String[] args) {
        Candy c1 = new Candy("candy1", 10.5, 100);
        Candy c2 = new Candy("candy2", 11.5, 110);
        Chocolate ch1 = new Chocolate("chocolate1", 15.5, 150);
        Chocolate ch2 = new Chocolate("chocolate2", 16.5, 160);

        BoxWithSweets b1 = new BoxWithSweets();
        b1.addTheSweet(c1);
        b1.addTheSweet(c2);
        b1.addTheSweet(ch1);
        b1.addTheSweet(ch2);

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
