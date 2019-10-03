package com.java.javacertification.chp_4_methods_encapsulation.swan;

import com.java.javacertification.chp_4_methods_encapsulation.duck.MotherDuck;

public class BadCygnet {
    public void makeNoise() {
        MotherDuck duck = new MotherDuck();
        //duck.quack(); // DOES NOT COMPILE
        //System.out.println(duck.noise); // DOES NOT COMPILE
    }
}
