package com.java.javacertification.chp_5_class_design.overridding;

public class Panda extends Bear {
    public static void eat() {
        System.out.println("Panda bear is chewing");
    }
    public static void main(String[] args) {
        Panda.eat();
    }
    /*public void sneeze() { // DOES NOT COMPILE
        System.out.println("Panda bear sneezes quietly");
    }
    public static void hibernate() { // DOES NOT COMPILE
        System.out.println("Panda bear is going to sleep");
    }*/
}
