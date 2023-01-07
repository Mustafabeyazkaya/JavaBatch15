package class5;

import java.util.Scanner;

public class ScannerDemo3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*
        Scanner=>Name of the class
        scan is just a variable like we create primitive variables
        = => assignment operator
        System.in=> tells to computer we want to read the data from keyboard.
         */
        System.out.println("Please enter your age");
        int age=input.nextInt();
        System.out.println("You are "+age+" years old.");
        System.out.println("Please enter your weight");
        double weight=input.nextDouble();
        System.out.println("Your weight is "+weight);

    }

}
