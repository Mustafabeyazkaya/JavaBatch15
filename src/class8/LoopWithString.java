package class8;

import java.util.Scanner;

public class LoopWithString {
    public static void main(String[] args) {
        Scanner inp= new Scanner(System.in);
        System.out.println("Please enter your name");
        while (inp.next().equalsIgnoreCase("Sha")){
            System.out.println("Great student who always wanted an example with string in loop.");
        }


    }
}
