package com.java.javacertification.chp_4_methods_encapsulation.constructor;

public class YetMoreInitializationOrder {
    static {
        add(2);
    }

    static void add(int num) {
        System.out.print(num + " ");
    }

    YetMoreInitializationOrder() {
        add(5);
    }

    static {
        add(4);
    }

    {
        add(6);
    }

    static {
        new YetMoreInitializationOrder();
    }
    static {
        add(7);
    }

    {
        add(8);
    }

    public static void main(String[] args) {
    }
}
