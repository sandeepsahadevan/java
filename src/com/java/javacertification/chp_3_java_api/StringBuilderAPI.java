package com.java.javacertification.chp_3_java_api;

import java.util.ArrayList;
import java.util.Arrays;

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

        String name3 = new String("Sandeep");
        StringBuilder sb2 = new StringBuilder("Sandeep");
        StringBuilder sb3 = new StringBuilder("Sandeep");
        System.out.println("sb..toString().equals(name) -> " + (sb.toString().equals(name)));
        System.out.println("sb.equals(name) -> " + (sb.equals("Sandeep")));
        System.out.println("sb2.equals(sb3) -> "+ (sb2.equals(sb3)));

        System.out.println("name == name2 ->" + (name == name2));
        System.out.println("name.equals(name2) ->" + (name.equals(name2)));
        System.out.println("name == sb2.toString() ->" + (name == sb2.toString()));
        System.out.println("name == sb2.toString() ->" + ("Sandeep" == sb2.toString()));

        System.out.println("name3.equals(sb2) -> "+ (name3.equals(sb2)));
        //System.out.println(null);
        StringBuilder sb4 = new StringBuilder("Java8");
        sb4.reverse().deleteCharAt(0).append("SE").delete(3,sb.length());
        System.out.println(sb4);
        ArrayList<String> l = new ArrayList<>();
        l.size();

        sb4.capacity();
        sb4.length();
        name.length();
        String a = "";
         a += 2;
         a += 'c';
         a += false;
         if ( a == "2cfalse") System.out.println("==");
         if ( a.equals("2cfalse")) System.out.println("equals");
        int[] random = { 6, 0,5,6,5,6,5, 12, 0, -10 };
        int x = 12;
        int y = Arrays.binarySearch(random, x);
        System.out.println(y);
        int x1 = 5 * 4 % 3;
        System.out.println(x1);

        int[] i = {1,2,3};
        int[] i1 = {1,2,3};
        System.out.println(i.equals(i1));



    }
}
