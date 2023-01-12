package class7;

import java.util.Scanner;

public class DoWhileLoops {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int number=0;
        do {
            System.out.println("Please enter a number");
            number=inp.nextInt();
        }while (number!=5);

    }
}
