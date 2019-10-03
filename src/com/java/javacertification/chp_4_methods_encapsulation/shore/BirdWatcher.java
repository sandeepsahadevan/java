package com.java.javacertification.chp_4_methods_encapsulation.shore;

public class BirdWatcher {
    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater(); // calling protected member
        System.out.println(bird.text); // calling protected member
    }
    public static void main(String... args){
        BirdWatcher bw = new BirdWatcher();
        bw.watchBird();
    }
}
