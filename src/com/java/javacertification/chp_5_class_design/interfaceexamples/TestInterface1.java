package com.java.javacertification.chp_5_class_design.interfaceexamples;

public interface TestInterface1 {

    public int one = 1;

    static int two = 2;

    final int three = 3;

    public static int four = one + 4;

    public String name = "Jedd";

    public abstract int getNumberOne();

    public static int getNumberFour() {return TestInterface1.four;}

    public default int getNumberTwo() {return TestInterface1.two;}

    public default int getNumberThree() {return three;}

    public static int getNumbers() {return one;}
}
