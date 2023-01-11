package class5;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /* Write a program to find the largest number among three distinct numbers using nested if condition
        Please use Scanner class to take input from users*/
        /*int num1 = 100, num2 = 200, num3 = 3000;

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("Num1 is the largest " + num1);
            }
        }
        if (num2 > num1) {
            if (num2 > num3) {
                System.out.println("Num2 is the largest " + num2);
            }
        }
        if (num3>num1){
            if (num3>num2){
                System.out.println("Num3 is the largest "+num3);
            }
        }
*/
        //OR

        int num1, num2, num3;
        Scanner inp=new Scanner(System.in);
        System.out.println("Please enter 3 different numbers at the console");
        num1=inp.nextInt();
        num2=inp.nextInt();
        num3=inp.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("Num1 is the largest " + num1);
            }
        }
        if (num2 > num1) {
            if (num2 > num3) {
                System.out.println("Num2 is the largest " + num2);
            }
        }
        if (num3>num1){
            if (num3>num2){
                System.out.println("Num3 is the largest "+num3);
            }
        }
    }
}
