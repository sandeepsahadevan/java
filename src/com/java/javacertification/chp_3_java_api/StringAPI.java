package com.java.javacertification.chp_3_java_api;

import java.util.ArrayList;

public class StringAPI {

    private void compareString(){
        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println("s1.equals(s2) ::::::::: "+s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println("sb1.toString().equals(s1) ::::::::: "+sb1.toString().equals(s1));
    }
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

    private void testString(){
        String a = "";
        a += 2;
        a += 'c';
        a += false;
        if ( a == "2cfalse") System.out.println("==");
        System.out.println(a == "2cfalse");
        if ( a.equals("2cfalse")) System.out.println("equals");
    }

    void changeString() {
        StringBuilder sb= new StringBuilder();
        sb.append("hello"); // makes change

        //sb = "howdy"; // Doesn't make change
        System.out.println("Equals :::: "+sb.equals("hello"));
        System.out.println("Equals :::: "+sb.equals(sb));
    }

    public static void main(String... args){
        StringAPI si = new StringAPI();
        int[][] java = new int[1][1];
        ArrayList<String> list1 = new ArrayList<>();
        list1.size();
        si.compareString();
        si.changeString();
        //si.subString();
        //si.indexOf();
        //si.testString();

    }
}
