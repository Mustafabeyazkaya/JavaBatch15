package HomeWork4;

import java.util.Scanner;

public class Birthday {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Please enter the month you were born at");
        String month=inp.nextLine().toLowerCase();
        if (month.equalsIgnoreCase("December")|| (month.equalsIgnoreCase("January"))||(month.equalsIgnoreCase("February"))){
            System.out.println("You were born at Winter");
        }else if (month.equalsIgnoreCase("March")|| (month.equalsIgnoreCase("April"))|| (month.equalsIgnoreCase("May"))) {
            System.out.println("You were born at Spring");
        }else if (month.equalsIgnoreCase("June")||(month.equalsIgnoreCase("July"))||(month.equalsIgnoreCase("August"))){
            System.out.println("You were born at Summer");
        }else {
            System.out.println("You were born at Fall");
        }



    }
}
