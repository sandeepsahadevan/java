package com.java.javacertification.chp_5_class_design;

public class Capybara extends Rodent {
    String  override = "Child Variable";

    public static void main(String[] args) {
        Rodent rodent = new Rodent();
        //Capybara capybara = (Capybara)rodent; // Throws ClassCastException at runtime
        rodent.override();
        System.out.println(rodent.override);
        rodent = new Capybara();
        rodent.override();
        System.out.println(rodent.override);
        Capybara capybara =new Capybara();
        capybara.override();
        System.out.println(capybara.override);
    }
    public void override(){
        System.out.println("Child");
    }
}