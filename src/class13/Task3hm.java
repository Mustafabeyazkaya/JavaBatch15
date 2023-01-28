package class13;

import java.util.Scanner;

public class Task3hm {
    public static void main(String[] args) {
        /*
        3) Write a program that reads two people's first
        names and if they expecting boy or girl?
                Based on the input suggests a name for a baby:
        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? boy
        Suggested baby name: DANRY

        Example Output:
        Mom’s first name? Mary
        Dad’s first name? Daniel
        Boy or Girl? girl
        Suggested baby name: MAIEL
         */
        Scanner inp=new Scanner(System.in);
        System.out.println("Please say which sex of your kids you are expecting to see suggestion name for");
        String dadName="Daniel";
        String  momName="Mary";
        String expectation=inp.next();
        String firstHalf="";
        String secondHalf="";
        if (expectation.equalsIgnoreCase("boy")){
            firstHalf=dadName.substring(0,dadName.length()/2);
            secondHalf=momName.substring(momName.length()/2);

        }else {
            firstHalf=momName.substring(0,momName.length()/2);
            secondHalf=dadName.substring(dadName.length()/2);
        }
        System.out.println(firstHalf+secondHalf);
    }
}
