package com.java.javacertification.chp_4_methods_encapsulation;

class Parent1
{
    int x =10;
    private  void m1()
    {
        System.out.println("Parent");
    }
}
class Child1 extends Parent1
{
    int x=20;
    public void m1()
    {
        System.out.println("Child");
    }
}
public class Test
{
    Test(Integer I)
    {
        System.out.print(0);
    }
    Test(int... i)
    {
        System.out.print(1);
    }
    Test(double d)
    {
        System.out.print(2);
    }
    Test(Object o)
    {
        System.out.print(3);
    }
    public static void m1(int x)
    {
        System.out.println("int argument");
    }
    public static void m1(short x)
    {
        System.out.println("short argument");
    }
    public static void m1(double x)
    {
        System.out.println("double argument");
    }



    public static void main(String[] args)
    {
        Parent1 p = new Child1();
        System.out.println(p.x);
        //p.m1();
        Child1 c = new Child1();
        c.m1();
        new Test('a');
        new Test(10);
        new Test(10.5);

        char ch = 'j';
        m1(ch);
    }
}