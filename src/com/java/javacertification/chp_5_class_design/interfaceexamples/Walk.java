package com.java.javacertification.chp_5_class_design.interfaceexamples;

public interface Walk {
    public default int getSpeed() {
        return 5;
    }
    abstract Object interviewConducted();

}
