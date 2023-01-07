package class4;

public class IfElseIfConditionDemo4 {

    public static void main(String[] args) {
        int number1=10;
        int number2=10;
        /* if number1 equal to number2 on console => numbers are equal
        if number1 is greater than number2 on console => number1 is greater than number2
        if number2 is greater than number1 on console => number2 is greater than number1
        */
        if (number1==number2){
            System.out.println("Numbers are equal");
        }else if (number1>=number2){
            System.out.println("Number1 is greater than number2");
        }else {
            System.out.println("Number2 is greater than number1");
        }
    }
}
