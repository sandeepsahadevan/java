package com.java.javacertification.chp_4_methods_encapsulation;

interface Left
{
    //default void m1()
    //{
      //  System.out.println("Left Default Method");
    //}
}
interface Right
{
    default void m1()
    {
        System.out.println("Right Default Method");
    }
}
public class TestInterface implements Left, Right
{
    public static void main(String[] args)
    {
        TestInterface t = new TestInterface();
        t.m1();
    }
}
