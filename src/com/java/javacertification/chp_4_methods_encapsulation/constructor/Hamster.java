package com.java.javacertification.chp_4_methods_encapsulation.constructor;

public class Hamster {
    private String color;
    private int weight;
    public Hamster(int weight) { // first constructor
        this(weight,"Brown");
        //this.weight = weight;
        //color = "brown";
        new Hamster(weight, "brown");

    }
    public Hamster(int weight, String color) { // second constructor
        this.weight = weight;
        this.color = color;
    }
    public static void main(String... args){
        Hamster h = new Hamster(4,"White");
        System.out.println(h.color+"   "+h.weight);
        Hamster h1 = new Hamster(5);
        System.out.println(h1.color+"   "+h1.weight);
    }
}
