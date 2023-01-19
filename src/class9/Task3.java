package class9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Please enter 2 numbers starting point and ending point");
        int start=inp.nextInt();
        int end=inp.nextInt();
        int evenSum=0;
        int oddSum=0;
        for (int i = start; i < end; i++) {
            if (i%2==0){
                evenSum+=i;
            }else {
                oddSum=oddSum+i;
            }
        }
        System.out.println("Sum of all the Even Numbers "+evenSum);
        System.out.println("Sum of all the Odd Numbers "+oddSum);

    }
}
