package com.java.javacertification.chp_3_java_api;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {
    public void autoboxing() {
        List<Double> weights = new ArrayList<>();
        weights.add(50.5); // [50.5]
        weights.add(new Double(60)); // [50.5, 60.0]
        weights.remove(50.5); // [60.0]
        double first = weights.get(0); // 60.0
        System.out.println(first);

        List listOne = new ArrayList<>();
        List listTwo = new ArrayList<>();
        System.out.println(listOne.equals(listTwo));
        listOne.add("hawk");
        System.out.println(listOne.equals(listTwo));
        listTwo.add("hawk");
        System.out.println(listOne.equals(listTwo));
        listOne.add(0, "doggle");
        listTwo.add("doggle");
        System.out.println(listOne.equals(listTwo));
    }

    public static void main(String... args) {
        Autoboxing ab = new Autoboxing();
        ab.autoboxing();
    }
}
