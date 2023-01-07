package HomeWork3;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        System.out.println("Please enter number of worked year");
        System.out.println("Please enter your annual salary");

       int wYear=Input.nextInt();

        double aSalary=Input.nextDouble();
        if (wYear>=5){

            System.out.println("User is eligible for the bonus");

            if (aSalary>=50000){
                System.out.println("Bonus is 5000");
            }else{
                System.out.println("Bonus is 3000");
            }
        }else{
            System.out.println("Unfortunally, He is not");
        }
    }
}
