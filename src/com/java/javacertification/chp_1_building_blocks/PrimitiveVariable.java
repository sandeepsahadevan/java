package com.java.javacertification.chp_1_building_blocks;

import java.io.FileNotFoundException;

public class PrimitiveVariable {

    static int intvalue= 0xE;
    static int amount = 0b101;
    static double doublevalue = 0xE;


    public static void main(String... args){
        System.out.println(intvalue);
        System.out.println(amount);
        System.out.println(doublevalue);
        //add(10.0, new Double(10.0));
    }
    protected static void add(double d1, double d2) {
        System.out.println("double version: " + (d1 + d2));
    }

    private static void add(Double d1, Double d2) {
        System.out.println("Double version: " + (d1 + d2));
    }

    public void read() throws FileNotFoundException {}



}
