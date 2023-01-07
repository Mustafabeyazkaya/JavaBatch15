package HomeWork3;

import class4.IfDemo1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age=Input.nextInt();
        if (age>=18){
            System.out.println("We can issue a driver licence");
        }else{
            System.out.println("Please get a learner permit");
        }
    }
}
