package com.java.javacertification.chp_5_class_design.overridding;

public class Snake extends Reptile {
    //protected boolean hasLegs() throws Exception{
    //  return false;
    //}
    protected double getWeight() throws InsufficientDataException {
        return 2;
    }
    //protected double getHeight() throws Exception { // DOES NOT COMPILE
    //    return 2;
    //}
    //protected int getLength() throws InsufficientDataException { // DOES NOT COMPILE
    //  return 10;
    //}
}
