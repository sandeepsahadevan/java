package com.java.javacertification.chp_3_java_api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAndList {
    public void arrayToList(){
        String[] array = { "hawk", "robin" }; // [hawk, robin]
        List<String> list = Arrays.asList(array); // returns fixed size list
        System.out.println(list.size()); // 2
        int i = array.length;
        list.set(1, "test"); // [hawk, test]
        array[0] = "new"; // [new, test]
        for (String b : array) System.out.print(b + " "); // new test
        //list.remove(1); // throws UnsupportedOperation Exception
        ArrayList<String> aa = new ArrayList<String>();

        aa = new ArrayList(list);
        aa.add("SAndeep");
        System.out.println(aa); // 2

        List<Integer> list1 = new ArrayList<Integer>();

        list1.add(27);
        list1.add(27);

        list1.add(new Integer(27));
        list1.add(new Integer(27));

        System.out.println(list1.get(0) == list1.get(1));
        System.out.println(list1.get(2) == list1.get(3));
        final boolean flag;
        flag = false;
        while(flag) {
            System.out.println("Good Morning!");
        }

    }

    public static void main(String... args){
        ArrayAndList ab = new ArrayAndList();
        ab.arrayToList();
        List<String> list = new ArrayList<>(4);
        list.add(0, "Array");
        list.add(1, "List");
        Boolean [] arr = new Boolean[2];
        System.out.println(arr[0] + ":" + arr[1]);

        System.out.println(list);

    }
}
