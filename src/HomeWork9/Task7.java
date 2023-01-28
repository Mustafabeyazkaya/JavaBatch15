package HomeWork9;

import javax.swing.*;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /*
        7)Write a java program to check whether a given number is prime or not?
         */
        Scanner inp=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num=inp.nextInt();
        boolean isPrime=true;
        if (num<2){
            System.out.println(num+" is not a prime number");
        }else {
            for (int i = 2; i < num; i++) {
                if (num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }if (isPrime){
                System.out.println(num+" is a prime number");
        }else {
            System.out.println(num+" is not a prime number");
        }

    }
}
