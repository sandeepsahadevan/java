package com.java.javacertification.chp_4_methods_encapsulation;

public class Methods {

    public static void walk1(int... nums) { }
    public static  void walk2(int start, int... nums) {
        System.out.println(nums.length);
    }
    //public void walk3(int... nums, int start) { } // DOES NOT COMPILE
    //public void walk4(int... start, int... nums) { } // DOES NOT COMPILE

    public static void main(String[] args) {
        walk2(1); // 0
        walk2(1, 2); // 1
        walk2(1, 2, 3); // 2
        walk2(1, new int[] {4, 5}); // 2
        walk2(1, null); //Null pointer Exception
    }
}
