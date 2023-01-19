package class9;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("Do you wanna apply for a credit card?");
            String userResponse=inp.next();
            if (userResponse.equalsIgnoreCase("Yes")){
                break;
            }

        }
    }
}
