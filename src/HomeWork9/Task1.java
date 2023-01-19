package HomeWork9;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Please enter integer values");
        int [] integers=new int[4];
        integers[0]=inp.nextInt();
        integers[1]=inp.nextInt();
        integers[2]=inp.nextInt();
        integers[3]=inp.nextInt();
        int sum=0;
        for (int i = 0; i < integers.length; i++) {
            sum=sum+ integers[i];
        }
        System.out.println(sum);

    }
}
