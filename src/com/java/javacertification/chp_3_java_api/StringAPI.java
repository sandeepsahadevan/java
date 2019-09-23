package com.java.javacertification.chp_3_java_api;

public class StringAPI {
    private void subString(){
        String string = "animals";
        System.out.println(string.substring(3)); // mals
        System.out.println(string.substring(string.indexOf('m'))); // mals
        System.out.println(string.substring(3, 4)); // m
        System.out.println(string.substring(3, 7)); // mals
        System.out.println(string.substring(3, 3)); // empty string
        //System.out.println(string.substring(3, 2)); // throws exception
        //System.out.println(string.substring(3, 8)); // throws exception
        System.out.println(string.toUpperCase()); // ANIMALS
        System.out.println("Abc123".toLowerCase()); // abc123
        System.out.println(string);
    }

    private void indexOf(){
        String string = "animals";
        System.out.println(string.indexOf('a')); // 0
        System.out.println(string.indexOf("al")); // 4
        System.out.println(string.indexOf('a', 4)); // 4
        System.out.println(string.indexOf("al", 5)); // -1
    }

    public static void main(String... args){
        StringAPI si = new StringAPI();

        si.subString();
        si.indexOf();
    }
}
