package com.java.javacertification.chp_1_building_blocks;

public class Grasshopper {
    public Grasshopper(String n) {
        name = n;
    }

    public static void main(String[] args) {
        byte b = 100;
        Grasshopper one = new Grasshopper("g1");
        Grasshopper two = new Grasshopper("g2");
        one = two;
        two = null;
        one = null;

        String str = "java";
        StringBuilder sb = new StringBuilder("java");

        System.out.println(str.equals(sb) + ":" + sb.equals(str));

        StringBuilder sb1 = new StringBuilder("Java");
        String s1 = sb1.toString();
        String s2 = sb1.toString();

        System.out.println(s1 == s2);
    }

    private String name;
}
