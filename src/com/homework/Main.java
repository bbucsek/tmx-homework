package com.homework;

import com.homework.task2.Flower;
import com.homework.task2.Shoe;

public class Main {

    public static void main(String[] args) {

        Shoe adidas = new Shoe("Adidas", 44, 17);
        Shoe reebok = new Shoe("Reebok", 40.5, 10);
        Shoe nike = new Shoe("Nike", 38, 0);
        Flower lily = new Flower("Lily", 8);
        Flower hyacinth = new Flower("Hyacinth", 1);

        System.out.println(adidas.price());
        System.out.println(reebok.price());
        System.out.println(nike.price());
        System.out.println(lily.price());
        System.out.println(hyacinth.price());

    }
}
