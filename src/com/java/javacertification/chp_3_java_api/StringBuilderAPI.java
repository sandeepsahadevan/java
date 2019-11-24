package com.java.javacertification.chp_3_java_api;

public class StringBuilderAPI {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder(100);
        System.out.println("sb.capacity() -> " + (sb.capacity()));
        System.out.println("sb.length() -> " + (sb.length()));

        sb.append("Sandeep");
        System.out.println("sb.capacity() -> " + (sb.capacity()));
        System.out.println("sb.length() -> " + (sb.length()));

        String name = "Sandeep";
        String name2 = "Sandeep";
        StringBuilder sb2 = new StringBuilder("Sandeep");
        System.out.println("sb.equals(name) -> " + (sb.equals(name)));
        System.out.println("sb.equals(name) -> " + (sb.equals("Sandeep")));
        System.out.println("sb.equals(sb2) -> "+ (sb.equals(sb2)));

        System.out.println("name == name2 ->" + (name == name2));
        System.out.println("name.equals(name2) ->" + (name.equals(name2)));
        System.out.println("name == sb2.toString() ->" + (name == sb2.toString()));
        System.out.println("name == sb2.toString() ->" + ("Sandeep" == sb2.toString()));
        //System.out.println(null);
    }
}
