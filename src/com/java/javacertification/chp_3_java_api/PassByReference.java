package com.java.javacertification.chp_3_java_api;

public class PassByReference {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Sandeep");
        System.out.println(s);
        method(s);
        System.out.println(s);
    }

    static void method(StringBuilder s){
        s.append("saharsh");
    }
}
