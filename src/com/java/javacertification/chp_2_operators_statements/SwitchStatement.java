package com.java.javacertification.chp_2_operators_statements;

import java.util.Arrays;
import java.util.List;

public class SwitchStatement {

       private int getSortOrder(String firstName, final String lastName) {
        String middleName = "Patricia";
        final String suffix = "JR";
        int id = 0;
        switch(firstName) {
            case "Test":
                return 52;
            /* case middleName: // DOES NOT COMPILE
                id = 5;
                break;*/
            case suffix:
                id = 0;
                break;
            /*case lastName: // DOES NOT COMPILE
                id = 8;
                break;
            case 5: // DOES NOT COMPILE
                id = 7;
                break;
            case 'J': // DOES NOT COMPILE
                id = 10;
                break;
            case java.time.DayOfWeek.SUNDAY: // DOES NOT COMPILE
                id=15;
                break;*/
        }
        return id;
    }

    private void switchBreak(int i){
        switch(i) {
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }

    private void SwitchNoBreak(int i){
       switch(i) {
            case 0:
                System.out.println("Sunday");
            default:
                System.out.println("Weekday");
            case 6:
                System.out.println("Saturday");
                break;
        }
    }

    private void switchForloop(){
        char y = 'y';
        char z = 'z';
        List numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println("List Size :::: "+ numbers.size());
        switch (y) {
            case 'y':
                for (int i = 0; i < numbers.size(); i++) {
                    System.out.println("y is equal to y");
                    break;
                }
                break;
            case 'z':
                System.out.println("y is equal to z");
            default:
                System.out.println("y isn't equal to anything");
        }
    }

    public  static void main(String... args){
        SwitchStatement o = new SwitchStatement();
        int i =5;
        o.switchBreak(i);
        //o.SwitchNoBreak(i);
        //o.switchForloop();

        String fruit = new String(new char[] {'M', 'a', 'n', 'g', 'o'});
        switch (fruit) {
            default:
                System.out.println("ANY FRUIT WILL DO");
            case "Apple":
                System.out.println("APPLE");
            case "Mango":
                System.out.println("MANGO");
            case "Banana":
                System.out.println("BANANA");
                break;
        }
       }
}
