package HomeWork8;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        double totalPrice=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter item and price");
            String item=inp.next();
            double price=inp.nextDouble();
            totalPrice+=price;
        }
        System.out.println("Please pay for your shopping "+totalPrice);
        double amountofPayment=inp.nextDouble();
        double change=amountofPayment-totalPrice;
        double payOff=totalPrice-amountofPayment;
        if (totalPrice<amountofPayment){
            System.out.println("Here is your change "+ change);
            System.out.println("Thank you for shopping with us");
        } else if (totalPrice>amountofPayment) {
            System.out.println("Please pay "+payOff+" more");
            double additionalPayment=inp.nextDouble();
            System.out.println("Thank you for shopping with us");
        } else {
            System.out.println("Thank you for shopping with us");
        }
    }
}
