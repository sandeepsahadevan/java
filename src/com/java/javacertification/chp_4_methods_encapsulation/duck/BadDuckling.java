package com.java.javacertification.chp_4_methods_encapsulation.duck;

public class BadDuckling {


    public void makeNoise() {
        FatherDuck duck = new FatherDuck();
        //duck.quack(); // DOES NOT COMPILE
        //System.out.println(duck.noise); // DOES NOT COMPILE
    }
}
