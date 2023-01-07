package HomeWork3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner Input = new Scanner(System.in);
        System.out.println("Please enter your name of city");
        String city=Input.next();
        System.out.println("Please enter temperature in your city");
        double temp=Input.nextDouble();
        System.out.println("The temperature is "+(temp-32) *5/9+"C in "+city);
    }
}
