package class10;

import java.util.Arrays;
import java.util.Scanner;

public class ScannerAndArrays {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Please enter 5 numbers");
        int [] num=new int[5];//This is a empty array where we want to store 5 numbers
       /* below code manually storing numbers in the arrays
        num[0]=40;
        num[1]=50;
        num[2]=60;
        num[3]=70;
        num[4]=80;
        System.out.println(Arrays.toString(num));*/
       /*below code take the numbers from user and store them in the array its good but a lot of code
        num[0]= inp.nextInt();
        num[1]= inp.nextInt();
        num[2]= inp.nextInt();
        num[3]= inp.nextInt();
        num[4]= inp.nextInt();
        System.out.println(Arrays.toString(num));*/
        for (int i = 0; i < num.length; i++) {
            num[i]=inp.nextInt();
        }
        System.out.println(Arrays.toString(num));
    }
}
