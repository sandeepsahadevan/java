package com.java.javacertification.chp_2_operators_statements;

public class LogicalOperator {
    private void logical(){
        int x = 6;
        boolean y = (x >= 6) || (++x <= 7);
        int z = 8/2*(2+2);
        System.out.println(x);
        System.out.println(z);
    }

    public  static void main(String... args){
        LogicalOperator l = new LogicalOperator();
        l.logical();
    }
}
