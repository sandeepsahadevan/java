package com.java.javacertification.chp_3_java_api;

import java.util.ArrayList;
import java.util.List;

public class StringAPI {

    private void compareString() {
        String s1 = "Java";
        String s2 = "Java";
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Ja").append("va");
        System.out.println(s1 == s2);
        System.out.println("s1.equals(s2) ::::::::: " + s1.equals(s2));
        System.out.println(sb1.toString() == s1);
        System.out.println("sb1.toString().equals(s1) ::::::::: " + sb1.toString().equals(s1));
    }

    private void subString() {
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

    private void indexOf() {
        String string = "animals";
        System.out.println(string.indexOf('a')); // 0
        System.out.println(string.indexOf("al")); // 4
        System.out.println(string.indexOf('a', 4)); // 4
        System.out.println(string.indexOf("al", 5)); // -1
        System.out.println(string.substring(3));
        System.out.println(string.substring(string.indexOf('m')));
        System.out.println(string.substring(3, 4));
        System.out.println(string.substring(3, 6));
        //System.out.println(string.substring(3, 8));
        System.out.println(string.substring(3, 3));
        //System.out.println(string.substring(3, 2));

    }

    private void testString() {
        String a = "";
        a += 2;
        a += 'c';
        a += false;
        if (a == "2cfalse") System.out.println("==");
        System.out.println(a == "2cfalse");
        if (a.equals("2cfalse")) System.out.println("equals");
    }

    void changeString() {
        StringBuilder sb = new StringBuilder();
        sb.append("hello"); // makes change

        //sb = "howdy"; // Doesn't make change
        System.out.println("Equals :::: " + sb.equals("hello"));
        System.out.println("Equals :::: " + sb.equals(sb));
    }

    public static void main(String... args) {
        StringAPI si = new StringAPI();
        int[][] java = new int[1][1];
        ArrayList<String> list1 = new ArrayList<>();
        list1.size();
        si.compareString();
        si.changeString();

        double[] dbls = new double[]{1.0, 2.1, 3.5};


        dbls[1] = 10.5;
        System.out.print(dbls[1] + dbls[2]);

        int ar[][] = {{1, 11}, {1}, {1, 11}};
        for (int x = 0; x < ar.length; x++) {
            for (int y : ar[x]) System.out.print(y);
        }

        int x = -10;
        int y = 10;
        System.out.print(x % (-3));
        System.out.print("A");
        //si.subString();
        si.indexOf();
        //si.testString();
        List names = new ArrayList<>();
        names.add("Jedd");
        names.add("Lomin");

        String name = (String) names.get(0);

        System.out.println(names);

    }
}
