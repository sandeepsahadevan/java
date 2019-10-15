package com.java.javacertification.chp_6_exception;

public class ExceptionsEx {
    public String exceptions() {
        String result = "";
        String v = null;

        try {
            try {
                result += "before";
                v.length();
                result += "after";
            } catch (NullPointerException e) {
                result += "catch";
                throw new RuntimeException();
            } finally {
                result += "finally";
                throw new Exception();
            }
        } catch (Exception e) {
            result += "done";
        }
        return result;
    }
    public static void main(String... args){
        ExceptionsEx ee=  new ExceptionsEx();
        System.out.println(ee.exceptions());
    }
}
