package com.java.javacertification.chp_4_methods_encapsulation.lamda;

import java.util.ArrayList;
import java.util.List;

public class PredicateSearch {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", true, true));

        print(animals, (Animal a,String b) -> {return a.canHop();});
    }

    private static void print(List<Animal> animals, Predicate<Animal, String>   checker) {
        for (Animal animal : animals) {
            if (checker.test(animal,"Sandeep"))
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}
