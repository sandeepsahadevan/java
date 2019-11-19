package com.java.javacertification.chp_3_java_api;

public class StringBuilderAPI {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(100);
        System.out.println("sb.capacity() -> " + (sb.capacity()));
        System.out.println("sb.length() -> " + (sb.length()));

        sb.append("Sandeep");
        System.out.println("sb.capacity() -> " + (sb.capacity()));
        System.out.println("sb.length() -> " + (sb.length()));
    }
}
