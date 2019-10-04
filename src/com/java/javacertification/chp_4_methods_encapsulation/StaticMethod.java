package com.java.javacertification.chp_4_methods_encapsulation;

public class StaticMethod {
    public void staticMethod(){
        Koala k = new Koala();
        System.out.println(k.count); // k is a Koala
        k = null;
        System.out.println(k.count);
        Koala.count = 4;
        Koala koala1 = new Koala();
        Koala koala2 = new Koala();
        koala1.count = 6;
        koala2.count = 5;
        System.out.println(Koala.count);
    }

    public static void main(String... args){
        StaticMethod sm = new StaticMethod();
        sm.staticMethod();
    }
}
