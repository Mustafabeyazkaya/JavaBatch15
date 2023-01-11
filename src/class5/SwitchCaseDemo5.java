package class5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchCaseDemo5 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Please enter your gender");
       char gender=inp.next().charAt(0);
       switch (gender){
           case'f':
           case 'F':
               System.out.println("FEMALE");
               break;
           case'm':
           case 'M':
               System.out.println("MALE");
               break;
           default:
               System.out.println("not specified");
        }

    }}
