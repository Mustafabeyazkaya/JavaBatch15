package HomeWork4;

import java.util.Scanner;

public class NestedIfLargest {
    public static void main(String[] args) {
        int num1, num2, num3;
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter 3 different numbers");
        num1 = inp.nextInt();
        num2 = inp.nextInt();
        num3 = inp.nextInt();

        /*if (num1 > num2 && num1 > num3) {
            System.out.println("Number1 is the largest number " + num1);
            if (num2 > num1 && num2 > num3) {
                System.out.println("Number2 is the largest number " + num2);
                if (num3 > num1 && num3 > num1) {
                    System.out.println("Number2 is the largest number " + num3);

                }

            }

        }*/
        if (num1>num2){
            if (num1>num3){
                System.out.println("Number1 is the largest number " + num1);
            }
        }
        if (num2>num1){
            if (num2>num3){
                System.out.println("Number2 is the largest number " + num2);
            }
        }
        if (num3>num1){
            if (num3>num2){
                System.out.println("Number3 is the largest number " + num3);
            }
        }
        }
    }

