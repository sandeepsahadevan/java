package com.java.javacertification.chp_4_methods_encapsulation;

public class StaticAPI {
    private String name = "Static class";
    public static void first() { }
    public static void second() { }
    public void third() { System.out.println(name); }
    public static void main(String args[]) {
        first();
        second();
        //third(); // DOES NOT COMPILE
        new StaticAPI().third();
    }
}
