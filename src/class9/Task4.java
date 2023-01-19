package class9;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
       /* 1) Write a program to ask a user to enter item they want to buy and the price of that item.
        Every time user enters money accumulate the amount and tell the user how much is left to pay off.
                If user give more money program should return a change.
                Whenever a user done with payments program should say "Thank you for shopping!"
                */
        Scanner inp=new Scanner(System.in);
        double totalPrice=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter the item and its price");
            String itemName=inp.next();
            double itemPrice=inp.nextDouble();
            totalPrice=totalPrice+itemPrice;
            System.out.println("This is the total amount that you have to pay "+totalPrice);
        }
        System.out.println("Please pay for the items");
        double amountPaid=inp.nextDouble();
        if (amountPaid>totalPrice){
            double chang=amountPaid-totalPrice;
            System.out.println("Hey here is your change "+chang);
            }
        else if (amountPaid<totalPrice){
            double more=totalPrice-amountPaid;
        System.out.println("Please provide "+more+" much money");
            }
        }
        }


