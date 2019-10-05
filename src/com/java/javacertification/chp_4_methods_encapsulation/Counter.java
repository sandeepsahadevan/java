package com.java.javacertification.chp_4_methods_encapsulation;

public class Counter {
    private static int count;
    private static int one;
    private static final int two;
    private static final int three = 3;
    //private static final int four; // DOES NOT COMPILE

    static {
        one = 1;
        two = 2;
        //three = 3; // DOES NOT COMPILE
        //two = 4; // DOES NOT COMPILE
    }

    public Counter() {
        count++;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();
        System.out.println(count); // 3
    }
}
