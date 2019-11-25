package com.java.javacertification.chp_5_class_design;

interface Aquatic {
    public default int getNumberOfGills(int input) {
        return 2;
    }

    public static int getNumberOfGills() {
        return 1;
    }
}

public class ClownFish implements Aquatic {
    public  int getNumberOfGills() {
        return 4;
    }
    public int howMany(boolean b, boolean... b2) {
        return b2.length;
    }

    //public String getNumberOfGills(int input) { return "6"; }
    public static void main(String[] args) {
        System.out.println(new ClownFish().getNumberOfGills(-1));
        System.out.println(new ClownFish().getNumberOfGills());
        new ClownFish().howMany(true,true);
        new ClownFish().howMany(true, new boolean[]{true,true});
        new ClownFish().howMany(true, new boolean[2]);
    }
}