package class4;

import java.util.Scanner;

public class ScannerDemo2 {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        System.out.println("Please enter your age");
        System.out.println("Please enter how much money you have in your pocket");
        System.out.println("Are you ready for holidays");
        int age=Input.nextInt();
        double money=Input.nextDouble();
        boolean ready=Input.nextBoolean();
        System.out.println("You are "+age+" years old");
        System.out.println("i have "+money);
        System.out.println(ready+" i am ready");
}}
