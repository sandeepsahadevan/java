package com.java.javacertification.chp_6_exception;

public class ExceptionTypes {
    public int numberEggs=0;
    public void checkClassCast() {
        String type = "moose";
        //Integer number = (Integer) type; // DOES NOT COMPILE

        Object obj = type;
        Integer number = (Integer) obj;
    }

    public  void setNumberEggs(int numberEggs) {
        if (numberEggs < 0)
            throw new IllegalArgumentException(
                    "# eggs must not be negative");
        this.numberEggs = numberEggs;
    }

    public  void numberFormat() {
        Integer.parseInt("abc");
    }

    //ExceptionInInitializerError
    /*static {
        int[] countsOfMoose = new int[3];
        int num = countsOfMoose[-1];
    }*/

    //StackOverflowError
    /*public static void doNotCodeThis(int num) {
        doNotCodeThis(1);
    }*/


    public static void main(String... args){
        ExceptionTypes cc=  new ExceptionTypes();
        //cc.checkClassCast();
        //cc.setNumberEggs(-1);
        //cc.numberFormat();
        //cc.doNotCodeThis(4);
    }
}
