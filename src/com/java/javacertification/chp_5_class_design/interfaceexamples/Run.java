package com.java.javacertification.chp_5_class_design.interfaceexamples;

public interface Run {
    public default int getSpeed() {
        return 10;
    }
}
