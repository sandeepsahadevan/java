package com.java.javacertification.chp_3_java_api;

import java.util.Arrays;
import java.util.List;

public class ArrayAndList {
    public void arrayToList(){
        String[] array = { "hawk", "robin" }; // [hawk, robin]
        List<String> list = Arrays.asList(array); // returns fixed size list
        System.out.println(list.size()); // 2
        list.set(1, "test"); // [hawk, test]
        array[0] = "new"; // [new, test]
        for (String b : array) System.out.print(b + " "); // new test
        //list.remove(1); // throws UnsupportedOperation Exception
    }

    public static void main(String... args){
        ArrayAndList ab = new ArrayAndList();
        ab.arrayToList();
    }
}
