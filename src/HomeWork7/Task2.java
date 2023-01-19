package HomeWork7;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Do you want to apply for a credit card?");
        boolean crecard=inp.nextBoolean();
        int i=1;
        while (!crecard){
            if (i>=10){
            crecard=!crecard;
        }
            System.out.println("Do you want to apply for a credit card?");
            inp.nextBoolean();
            i++;
    }
        System.out.println("***OTHER SOLUTION***");
        for (int j = 0; j < 10; j++) {
            System.out.println("Do you wanna apply for a credit card?");
            String userResponse=inp.next();
            if (userResponse.equalsIgnoreCase("Yes")){
                break;
            }
            System.out.println("ANOTHER SOLUTION");
            System.out.println("Do you wanna apply for a credit card");
            String answer=inp.next();

            for (int k = 1; k < 10; k++) {
                System.out.println("Do you wanna apply for a credit card");
                answer=inp.next();
                if (answer.equalsIgnoreCase("yes")){
                    break;
                }
            }
}}}
