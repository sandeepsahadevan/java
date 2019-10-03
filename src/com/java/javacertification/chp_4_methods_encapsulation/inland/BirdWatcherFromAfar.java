package com.java.javacertification.chp_4_methods_encapsulation.inland;

import com.java.javacertification.chp_4_methods_encapsulation.shore.Bird;

public class BirdWatcherFromAfar {
    public void watchBird() {
        Bird bird = new Bird();
        //bird.floatInWater(); // DOES NOT COMPILE
        //System.out.println(bird.text); // DOES NOT COMPILE
    }
}

