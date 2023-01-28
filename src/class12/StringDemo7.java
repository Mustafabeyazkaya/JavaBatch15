package class12;

import java.sql.SQLOutput;

public class StringDemo7 {
    public static void main(String[] args) {
        String str="I love java";
        boolean startsWith=str.startsWith("I");
        System.out.println(startsWith);;
        System.out.println(str.endsWith("java"));
        System.out.println(str.contains("java"));// we use this method the see any word if it is mention about it

        // Method chaining is when multiple methods are called on the same line
        // only those methods can be chained which returns a String
        System.out.println(str.toLowerCase().startsWith("i"));
        /*System.out.println(str.length().startsWith("i"));*/


        System.out.println("*******");
        String str1="I love java";
        boolean startsWith1=str1.startsWith("I love");// we can want the method see the word where ever we want to see
        System.out.println(startsWith1);


    }
}
