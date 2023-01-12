package class7;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        boolean condition=true;
        Scanner inp=new Scanner(System.in);
        int num=10;
        while (condition){
            System.out.println("Please enter a number between 10 to 20");
            int userInput= inp.nextInt();
            if (userInput>num){
                System.out.println("Your entered number is greater");
            }else if (userInput<num){
                System.out.println("Your entered number is less");
            }else {
                System.out.println("You won!!!");
                condition=false;
            }
        }

    }
}
