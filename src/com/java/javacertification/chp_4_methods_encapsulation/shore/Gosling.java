package com.java.javacertification.chp_4_methods_encapsulation.shore;

public class Gosling extends Bird {
    public void swim() {
        floatInWater(); // calling protected member
        System.out.println(text); // calling protected member
    }
    public static void main(String... agrs){
        Gosling g = new Gosling();
        g.swim();
    }
}
