package com.java.javacertification.chp_5_class_design.overridding;

public class Bear //implements Omnivore, Herbivore
{
    public static void eat() {
        System.out.println("Bear is eating");
    }
    public static void sneeze() {
        System.out.println("Bear is sneezing");
    }
    public void hibernate() {
        System.out.println("Bear is hibernating");
    }
    /*public int eatPlants() { // DOES NOT COMPILE
        System.out.println("Eating plants: 10");
        return 10;
    }
    public void eatPlants() { // DOES NOT COMPILE
        System.out.println("Eating plants");
    }*/
}
