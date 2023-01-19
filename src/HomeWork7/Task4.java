package HomeWork7;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double totalPrice=0;
        for (int i=0;i<5; i++) {
            System.out.println("What do you want to buy and What is the Price?");
            String item=inp.next();
            double price=inp.nextDouble();
            totalPrice=totalPrice+price;
            System.out.println("Total payment is "+totalPrice);
        }
        double amountPayment=inp.nextDouble();
        double payOff=totalPrice-amountPayment;
        double change=amountPayment-totalPrice;
        if (amountPayment>totalPrice){
            System.out.println("Here is your change "+change);
        } else if (amountPayment<totalPrice){
            System.out.println("You need to pay "+payOff+" more to complete your shopping");
        } else {
            System.out.println(" Than you for shopping with us");
        }
}}
