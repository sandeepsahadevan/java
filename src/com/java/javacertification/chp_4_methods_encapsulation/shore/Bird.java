package com.java.javacertification.chp_4_methods_encapsulation.shore;

public class Bird {
    protected String text = "floating"; // protected access
    protected void floatInWater() { // protected access
        System.out.println(text);
    }
}
