package HomeWork4;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CountriesAndLang {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        System.out.println("Please enter your country");
        String country=inp.nextLine();
        if (country.equalsIgnoreCase("Turkey")){
            System.out.println("You speak Turkish");
        }else if (country.equalsIgnoreCase("Germany")){
            System.out.println("You speak Germany");
        }else if (country.equalsIgnoreCase("France")){
            System.out.println("You speak France");
        }else {
            System.out.println("Country is unknown in the system");
        }
        System.out.println("Please enter your grade on speaking your language");
        String grade=inp.nextLine();
        if (grade.equalsIgnoreCase("A")){
            System.out.println("Excellent");
        } else if (grade.equalsIgnoreCase("B")) {
            System.out.println("Good");
        } else if (grade.equalsIgnoreCase("C")) {
            System.out.println("Avarage");
        } else if (grade.equalsIgnoreCase("D")) {
            System.out.println("Bad");
        }else {
            System.out.println("Not Acceptable");
        }
    }
}
