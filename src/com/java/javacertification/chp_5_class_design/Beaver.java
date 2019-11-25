package com.java.javacertification.chp_5_class_design;

interface Inter{
        static Integer chew() throws Exception{
            System.out.println("Interface is chewing");
        return 1;
    }
}
 class Rodent1 {
    protected static Integer chew() throws Exception {
        System.out.println("Rodent is chewing");
        return 2;
    }
}
public class Beaver extends Rodent1 implements Inter{
    public static Integer chew() throws RuntimeException {
        System.out.println("Beaver is chewing on wood");
        return 3;
    }

    public static void main(String[] args)throws Exception {
        Rodent1 r = new Beaver();
        Beaver beaver = new Beaver();
        System.out.println(Inter.chew());
        System.out.println(beaver.chew());
        System.out.println(r.chew());
    }
}
