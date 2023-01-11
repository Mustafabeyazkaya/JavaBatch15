package HomeWork4;

import java.util.Scanner;

public class ExamplesScore {
    public static void main(String[] args) {
        double quizScore, midTermScore, finalScore;
        Scanner inp = new Scanner(System.in);
        System.out.println("Please enter your scores");
        quizScore = inp.nextDouble();
        midTermScore = inp.nextDouble();
        finalScore = inp.nextDouble();
        double avarage=(quizScore+midTermScore+finalScore)/3;
        if (avarage>=90) {
            System.out.println("Grade = A");
        }else if (avarage>=70&&avarage<=90) {
            System.out.println("Grade = B");
        }else if (avarage>=50&&avarage<=70){
            System.out.println("Grade = C");
        }else if (avarage<=50){
            System.out.println("Grade = F");
        }
    }

}
