package com.java.javacertification.chp_4_methods_encapsulation;

interface Climb {
 boolean isTooHigh(int height, int limit);
 }

       public class Climber {
public static void main(String[] args) {
         //check((h, l) -> h.append(l).isEmpty(), 5);
    int i =1;

         }
 private static void check(Climb climb, int height) {
         if (climb.isTooHigh(height, 10))
            System.out.println("too high");
         else
         System.out.println("ok");
         }
 }
