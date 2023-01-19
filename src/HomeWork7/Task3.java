package HomeWork7;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Please enter 2 integer number from starting and ending");

        int s=inp.nextInt();
        int e=inp.nextInt();
        int sumEven=0;
        int sumOdd=0;
        for (int i = s; i < e ;i++) {
            if (i%2==0){
                sumEven=sumEven+i;
            } else if (i%2!=0) {
                sumOdd=sumOdd+i;

            }
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);




    }
}
