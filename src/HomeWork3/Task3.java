package HomeWork3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner Input=new Scanner(System.in);
        System.out.println("Please enter your amount of loan");
        int Loan=Input.nextInt();
        if (Loan<=200000){
            System.out.println("We can lend the money");
        }else{
            System.out.println("Sorry we are not able to lend money");
        }

    }
}
