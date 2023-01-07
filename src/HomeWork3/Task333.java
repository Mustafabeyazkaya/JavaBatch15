package HomeWork3;

import java.util.Scanner;

public class Task333 {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        System.out.println("Please write down your temperature in your city ");
        System.out.println("Please enter your name of city");
        int Temp=Input.nextInt();
        String city=Input.next();
        System.out.println("The Temperature is "+(Temp-32) *5/9+" in "+city);






    }

}