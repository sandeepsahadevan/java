package com.java.javacertification.chp_5_class_design.interfaceexamples;
public interface IsWarmBlooded {
    public abstract boolean hasScales();
    public default double getTemperature() {
        return 10.0;
    }
    //public default double getTemperature1();

}
