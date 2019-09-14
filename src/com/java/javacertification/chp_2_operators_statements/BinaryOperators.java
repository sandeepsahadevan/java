package com.java.javacertification.chp_2_operators_statements;

public class BinaryOperators {
    private void binary(){
        //int x = 1.0; // DOES NOT COMPILE
        //short y = 1921222; // DOES NOT COMPILE
        //int z = 9f; // DOES NOT COMPILE
        //long t = 192301398193810323; // DOES NOT COMPILE
        int x = (int)1.0;
        short y = (short)1921222; // Stored as 20678
        int z = (int)9l;
        long t = 192301398193810323L;
        System.out.print(2147483647+1);

        short xs = 10;
        short ys = 3;
        //short zs = xs * ys; // DOES NOT COMPILe
    }

    public  static void main(String... args){
        BinaryOperators o = new BinaryOperators();
        o.binary();
    }
}
