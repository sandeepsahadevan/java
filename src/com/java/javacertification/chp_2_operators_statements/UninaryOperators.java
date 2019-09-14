package com.java.javacertification.chp_2_operators_statements;

public class UninaryOperators {
    private void add(){
        double x = 39.21;
        //float f = 2.1; Will not complie
        float y = 2.1f;
        float z = (float) (x+y);
       System.out.println(x+y);
    }

    private void uninary(){
        int counter = 0;
        System.out.println("Counter "+counter); // Outputs 0
        System.out.println("++Counter "+ ++counter); // Outputs 1
        System.out.println("Counter "+counter); // Outputs 1
        System.out.println("Counter-- "+counter--); // Outputs 1
        System.out.println("Counter "+counter); // Outputs 0

        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }

    public  static void main(String... args){
        UninaryOperators o = new UninaryOperators();
        o.add();
        o.uninary();
    }
}
