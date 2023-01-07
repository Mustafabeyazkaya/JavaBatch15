package HomeWork3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double morgRate=3.5;
        int morgPrice=200000;
        if (morgRate>=4.5){
            System.out.println("User will not buy a house");
        }else {
            System.out.println("User will consider to buy one");
        }
        Scanner Input=new Scanner(System.in);
        System.out.println("Please enter house price");
        int housePrice=Input.nextInt();
        if (housePrice>=200000){
            System.out.println("User will take a loan");
        }else {
            System.out.println("User will pay cash");
        }
    }
}
