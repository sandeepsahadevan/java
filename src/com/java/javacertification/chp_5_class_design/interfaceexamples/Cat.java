package com.java.javacertification.chp_5_class_design.interfaceexamples;

public class Cat implements Walk, Run{
    public static void main(String[] args) {
        //System.out.println(new Cat().getSpeed());
    }
    public int getSpeed() {
        return 1;
    }
}
