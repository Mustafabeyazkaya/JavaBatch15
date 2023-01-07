package HomeWork3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        boolean diploma=true;
        if (diploma){
            System.out.println("Congratulations");
        }else{
            System.out.println("Please get a degree");
        }
        Scanner Input=new Scanner(System.in);
        System.out.println("Please enter your GPA");
        double GPA=Input.nextDouble();
        if (GPA>=3.5){
            System.out.println("You are eligible for scholarship");
        }else{
            System.out.println("You should study harder");
        }
    }
}
