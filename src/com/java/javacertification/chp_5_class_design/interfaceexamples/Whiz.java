package com.java.javacertification.chp_5_class_design.interfaceexamples;

interface I{
    public default void print(){
        System.out.print("I");
    }

    static void method(){
        System.out.print("Static");
    }
}



public class Whiz{
    public static void main(String [] args){
        I i = new I(){};
        i.print();
        I.method();
    }
}

