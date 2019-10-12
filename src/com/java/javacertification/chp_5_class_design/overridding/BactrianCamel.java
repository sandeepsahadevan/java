package com.java.javacertification.chp_5_class_design.overridding;

public class BactrianCamel extends Camel {
    protected String getNumberOfHumps() { // DOES NOT COMPILE
        return "";
    }
    //protected int getNumberOfHumps() { // DOES NOT COMPILE
    //    return 2;
    //}
    //private int getNumberOfHumps() { // DOES NOT COMPILE
    //    return 2;
    //}
}
