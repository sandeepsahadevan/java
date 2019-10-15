package com.java.javacertification.chp_6_exception;

class NoMoreCarrotsException extends Exception {}
public class Bunny extends Hopper{
    public static void main(String[] args) throws NoMoreCarrotsException {
        eatCarrot();// DOES NOT COMPILE
    }
    public void hop() throws IllegalStateException { }

    public static void sampleMethod(){
        try {
            good();
        }catch(NoMoreCarrotsException e){
            System.out.print("sad rabbit");
        }
    }

    public void bad() {
        //try {
            eatCarrot();
        //} catch (NoMoreCarrotsException e ) {// DOES NOT COMPILE
        //    System.out.print("sad rabbit");
        //}
    }
    public static void good() throws NoMoreCarrotsException {
        eatCarrot();
    }
    private static void eatCarrot() { }
}
