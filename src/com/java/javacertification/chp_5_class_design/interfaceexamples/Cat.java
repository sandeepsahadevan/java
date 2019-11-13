package com.java.javacertification.chp_5_class_design.interfaceexamples;

public class Cat implements Walk, Run{
    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
        System.out.println(new Cat().interviewConducted());
    }
    public int getSpeed() {
        return 1;
    }
    public Integer interviewConducted() {
        return 1;
    }
}
