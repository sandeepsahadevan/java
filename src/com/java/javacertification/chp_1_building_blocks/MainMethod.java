package com.java.javacertification.chp_1_building_blocks;

import java.util.Random;

public class MainMethod {
    private String variable = "first", second_variable = "second", notInitialized;
    private int number = 1_00_000;

    {
        System.out.println(" variable first " + variable);
    }

    public MainMethod() {
        variable = "constructor";
        System.out.println(" variable constructor " + variable);
        {
            String inside_block = "inside Block";
            System.out.println("inside Block " + inside_block);
            System.out.println(" variable constructor " + variable);
        }
        PrimitiveVariable.add(1.0,2.0);
        //System.out.println("inside Block "+ inside_block); // DOES NOT COMPILE
    }

    public static void main(String... args) {
        MainMethod mm = new MainMethod();
        Random r = new Random();
        // TODO Auto-generated method stub
        System.out.println("Test java file .. " + r.nextInt(60));
        System.out.println(Integer.MAX_VALUE);
        System.out.println("variable main " + mm.variable);
        System.out.println(" " + mm.second_variable);
    }

}
