package com.java.javacertification.chp_4_methods_encapsulation.goose;

import com.java.javacertification.chp_4_methods_encapsulation.duck.DuckTeacher;

public class LostDuckling {
    public void swim() {
        DuckTeacher teacher = new DuckTeacher();
        teacher.swim(); // allowed
        System.out.println("Thanks" + teacher.name); // allowed
    } }
