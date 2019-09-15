package com.java.javacertification.chp_2_operators_statements;

public class ForLoop {

    private void forLoop(){
        int x = 0;
        long y = 10;
        for(y = 0, x = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(x + " ");
        }
    }

    private void forLoop1(){
        int x = 0;
        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.print(x);
    }

    private void forLoopNotCompile(){
        /*int x = 0;
        for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) { // DOES NOT COMPILE
            System.out.print(x + " ");
        }*/

        /*for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE
            System.out.print(x + " ");
        }*/
    }
}
