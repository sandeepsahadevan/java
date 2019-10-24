package com.java.javacertification.chp_4_methods_encapsulation;

class Parent {
    protected void go() throws java.io.FileNotFoundException {
        System.out.print("Parent");
    }
}

public class Child extends Parent{
    protected void go() throws RuntimeException{ System.out.print("Child"); }
}