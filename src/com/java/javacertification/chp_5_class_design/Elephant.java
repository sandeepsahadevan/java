package com.java.javacertification.chp_5_class_design;

public class Elephant extends Mammal {
    //public Elephant() { // DOES NOT COMPILE
    //}

    //public Elephant(int x) { // DOES NOT COMPILE
    //}

    public Elephant() { // DOES NOT COMPILE
        super(10);
    }

    public static void main(String... args){
        Elephant E = new Elephant();
        E.method();
        E.parentMethod();
        Mammal ME = new Elephant();
        ME.method();
        ME.parentMethod();
        Mammal M = new Mammal(10);
        M.method();
        M.parentMethod();
    }
}
