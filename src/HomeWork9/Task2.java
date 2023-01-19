package HomeWork9;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        String [] countries={"USA","TURKEY","RUSSIA","ENGLAND","GERMANY"};
        String [] capitols={"Washington","Ankara","Moscow","London","Berlin"};
        for (int i = 0; i < countries.length; i++) {
            System.out.println("Please enter the country");
            String country=inp.nextLine();
                switch (country){
                    case "USA":
                        System.out.println(capitols[0]);
                        break;
                    case "TURKEY":
                        System.out.println(capitols[1]);
                        break;
                    case "RUSSIA":
                        System.out.println(capitols[2]);
                        break;
                    case "ENGLAND":
                        System.out.println(capitols[3]);
                        break;
                    case "GERMANY":
                        System.out.println(capitols[4]);
                        break;
                    default:
                        System.out.println("Invalid country");
            }
        }
    }
}
