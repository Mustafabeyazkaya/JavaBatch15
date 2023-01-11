package class5;

public class SwitchCaseDemo {
    public static void main(String[] args) {
       /* int day = 10;
        if (day == 1) {
            System.out.println("Monday");
        } else if (day == 2) {
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if (day == 4) {
            System.out.println("Thursday");
        } else if (day == 5) {
            System.out.println("Friday");
        } else if (day == 6) {
            System.out.println("Saturday");
        } else if (day == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Wrong day");
        }*/
        /* if you wanna change if else statement to switch after you wrote all the codes on console,
        you just tap on any of if data on your code ans see the BULB and click the bulb you will see change
        if to switch and you can tka that way to change your codes from if to switch or switch to if
         */
        //
        /*
        -what is the Switch case statement
        Switch case statement are just another way of achieving the same results as if-else-if conditions.
        -Why should we learn about them:
         the reason we should use them is there are very fast to get result at console
          just the syntax


switch (true condition) {
case 1:

{output}

break;

case 2:

{output}

break;

default:
{otherwise output}

}*/
        // instead of this, write this code:
        int day=1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong day");
    }
}}
