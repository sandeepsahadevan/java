package com.java.javacertification.chp_3_java_api;

import java.util.ArrayList;
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
        ArrayList<String> aa = new ArrayList<String>();

        aa = new ArrayList(list);
        aa.add("SAndeep");
        System.out.println(aa); // 2
    }

    public static void main(String... args){
        ArrayAndList ab = new ArrayAndList();
        ab.arrayToList();
    }
}
