package com.java.javacertification.chp_1_building_blocks;

import java.util.Random;

public class MainMethod {
    private String variable = "first";
    { System.out.println(" variable first "+ variable); }

    public MainMethod(){
        variable = "constructor";
        System.out.println(" variable constructor "+ variable);
    }
    public static void main(String... args) {
        MainMethod mm = new MainMethod();
        Random r = new Random();
        // TODO Auto-generated method stub
        System.out.println("Test java file .. "+ r.nextInt(60));
        System.out.println(Integer.MAX_VALUE);
        System.out.println("variable main "+ mm.variable);
    }

}
