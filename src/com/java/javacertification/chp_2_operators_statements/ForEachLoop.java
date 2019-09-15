package com.java.javacertification.chp_2_operators_statements;

public class ForEachLoop {

    private void forEachLoop1(){
        final String[] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";
        for(String name : names) {
            System.out.print(name + ", ");
        }
    }

    private void forEachLoop2(){
        java.util.List<String> values = new java.util.ArrayList<String>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");
        for(String value : values) {
            System.out.print(value + ", ");
        }
        int[] valuesarray = new int[3];
        valuesarray[0] = 10;
        valuesarray[1] = new Integer(5);
        valuesarray[2] = 15;
        for(int i=1; i<valuesarray.length; i++) {
            System.out.print(valuesarray[i]-valuesarray[i-1]);
        }
        int test = new Integer(3);
    }

    private void forEachLoopNoCompile(){
        /*String[] names = new String[3];
        for(int name : names) { // DOES NOT COMPILE
            System.out.print(name + " ");
        }*/
    }
    public static void main(String... arg){
        ForEachLoop fe = new ForEachLoop();
        fe.forEachLoop1();
        fe.forEachLoop2();
    }
}
