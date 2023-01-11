package class5;

import java.util.Scanner;

public class ScannerDemo3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        /*
        Scanner=>Name of the class
        input is just a variable like we create primitive variables
        = => assignment operator
        System.in=> tells to computer we want to read the data from keyboard.
         */
//        System.out.println("Please enter your age");
//        int age=input.nextInt();
//        System.out.println("You are "+age+" years old.");
//        System.out.println("Please enter your weight");
//        double weight=input.nextDouble();
//        System.out.println("Your weight is "+weight+ " Kgs");
//        System.out.println("Are you hungry?");
//        boolean hungry=input.nextBoolean();
//        System.out.println("HUNGRY "+hungry);
//        System.out.println("Please enter your gender");
//        char gender=input.next().charAt(0);
//        System.out.println("Your gender is "+gender);

        System.out.println("Please enter your name");
        String name=input.next();
        System.out.println("Your name is "+name);

        input.nextLine();/* we can write one entra nexLine code before the next code to get input from costumer by usig nextLine code
        and trick to make nextLine method work after we have used any other method from */
        System.out.println("Please enter your full name");
        String fullName=input.nextLine();
        System.out.println("Your full name is "+fullName);
        input.close();// good practice
    }

}
