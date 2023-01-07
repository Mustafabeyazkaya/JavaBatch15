package HomeWork3;

import java.util.IllegalFormatCodePointException;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("1-Do you have a credit card?(Yes/No)");
        String aCard = Input.nextLine();
        aCard = aCard.toUpperCase();
        while (!aCard.equals("YES")) {
            System.out.println("You should enter a valid answer!");
            System.out.println("Do you have a credit card?(Yes/No)");
           String cCard=Input.nextLine().toUpperCase();
           aCard=cCard;
        }
        if (aCard.equals("YES")) {
            System.out.println("What is the Balance");
            double balance = Input.nextDouble();
            if (balance > 1000) {
                System.out.println("Pay off immediatly");
            } else {
                System.out.println("You can spend more");
            }
        }
    }

}


