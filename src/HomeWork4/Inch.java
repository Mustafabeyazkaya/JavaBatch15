package HomeWork4;

import java.util.Scanner;

public class Inch {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter your height");
        double height = inp.nextDouble();
        if (height <= 60.0) {
            System.out.println("You are short");
        }else if (height<=72 && height>=60) {
            System.out.println("You are medium");
        }else if (height>=72.0){
            System.out.println("You are tall");
        }
    }
}
