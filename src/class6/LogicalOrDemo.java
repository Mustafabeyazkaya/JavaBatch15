package class6;

import java.sql.SQLOutput;
import java.util.Scanner;

public class LogicalOrDemo {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Please enter a day");
        String day=inp.nextLine();

        if (day.equalsIgnoreCase("Monday")||day.equalsIgnoreCase("Friday")) {
            System.out.println("No Class Today");
        } else if (day.equalsIgnoreCase("Saturday")||day.equalsIgnoreCase("Sunday")) {
            System.out.println("Java class Enjoy");
        } else if (day.equalsIgnoreCase("Wednesday")||day.equalsIgnoreCase("Tuesday")) {
            System.out.println("Manuel Testing Class");
        } else {
            System.out.println("Wrong day entered");
        }
        inp.close();

    }
}
