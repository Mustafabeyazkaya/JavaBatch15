package class4;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

       // Below line helps us to get the input from the keyboard
        Scanner Input=new Scanner(System.in);
        System.out.println("Please enter your name");
        String name=Input.nextLine();// nextLine is used when we have to take sentences from the keyboard
        System.out.println("My name is "+name);

    }
}
