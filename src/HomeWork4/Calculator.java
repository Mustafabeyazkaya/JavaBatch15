package HomeWork4;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Please enter an operator which you make make an calculation with");
        char op=inp.next().charAt(0);
        System.out.println("Please enter first number");
        double frst= inp.nextDouble();
        System.out.println("Please enter second number");
        double scnd= inp.nextDouble();
        switch (op){
            case '+':
                System.out.println(frst+scnd);
                break;
            case '-':
                System.out.println(frst-scnd);
                break;
            case '/':
                System.out.println(frst/scnd);
                break;
            case'*':
                System.out.println(frst*scnd);
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
