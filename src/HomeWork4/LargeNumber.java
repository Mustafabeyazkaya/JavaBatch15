package HomeWork4;

import java.util.Scanner;

public class LargeNumber {
    public static void main(String[] args) {
        double num1, num2,num3;
        Scanner inp=new Scanner(System.in);
        System.out.println("Please enter 3 different decimal numbers");
        num1=inp.nextInt();
        num2=inp.nextInt();
        num3=inp.nextInt();
        if (num1>num2&&num1>num3){
            System.out.println("Num1 ("+num1+") is largest number");
        }else if (num2>num1&&num2>num3){
            System.out.println("Num2 ("+num2+") is largest number");
        }else {
            System.out.println("Num3 ("+num3+") is largest number");
        }
    }
}
