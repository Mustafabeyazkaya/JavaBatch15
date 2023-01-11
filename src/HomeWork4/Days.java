package HomeWork4;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Please enter the number of the week\'s day");
        int day=inp.nextInt();
        if (day<=5) {
            System.out.println("It is a weekday");
        }else {
            System.out.println("It is a weekend");

        /*switch (day){
            case 1:
                System.out.println("It is a weekday");
                break;
            case 2:
                System.out.println("It is a weekday");
                break;
            case 3:
                System.out.println("It is a weekday");
                break;
            case 4:
                System.out.println("It is a weekday");
                break;
            case 5:
                System.out.println("It is a weekday");
                break;
            case 6:
                System.out.println("It is a weekend");
                break;
            case 7:
                System.out.println("It is a weekend");
                break;
            default :{
                    System.out.println("Invalid day");
                }*/
        }
    }
}
