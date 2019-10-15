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
    public static void main(String... args){
        ExceptionTypes cc=  new ExceptionTypes();
        //cc.checkClassCast();
        cc.setNumberEggs(-1);
    }
}
