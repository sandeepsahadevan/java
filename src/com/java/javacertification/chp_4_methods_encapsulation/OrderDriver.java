package com.java.javacertification.chp_4_methods_encapsulation;

public class OrderDriver {
    public static void main(String[] args) {
        System.out.print(Order.result + " ");

        System.out.print(new Order().result + " ");

        System.out.print(new Order().result + " ");
    }
}