package com.java.javacertification.chp_2_operators_statements;

public class SwitchStatement {
    private void switchBreak(int i){
        switch(i) {
            default:
                System.out.println("Weekday");
                break;
            case 0:
                System.out.println("Sunday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
        }
    }

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


    public  static void main(String... args){
        SwitchStatement o = new SwitchStatement();
        int i =5;
        o.switchBreak(i);
        o.SwitchNoBreak(i);    }
}
