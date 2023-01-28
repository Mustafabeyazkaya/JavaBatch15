package class15;

import java.util.Scanner;

public class MethodPracticeTester {
    public static void main(String[] args) {
        // i got help from MorePractice from Project page that i created, check it please
        MethodPractice inp=new MethodPractice();
        boolean answer= inp.isEven(4);
        System.out.println(answer);
        //or we can use this short way
        System.out.println(inp.isEven(4));


        System.out.println("***");
        boolean answer1= inp.isEven1(5);
        System.out.println(answer1);
        //or we can use this short way
        System.out.println(inp.isEven(5));


        System.out.println("***");
        boolean answer2= inp.isEven2(7);
        System.out.println(answer2);
        //or we can use this short way
        System.out.println(inp.isEven(7));


        System.out.println("***");
        boolean answer3= inp.isEven(100);
        System.out.println(answer3);
        //or we can use this short way
        System.out.println(inp.isEven(100));


        System.out.println("***");
        boolean answer4= inp.isEven(12);
        System.out.println(answer4);
        //or we can use this short way
        System.out.println(inp.isEven(12));


        System.out.println("***");
        boolean answer5= inp.isEven(20);
        System.out.println(answer5);
        //or we can use this short way
        System.out.println(inp.isEven(20));

        String team= inp.Team("fenerbahce");
        System.out.println(team);
        //or we can use this short way
        System.out.println(inp.Team("GALATASARAY"));
    }
}
