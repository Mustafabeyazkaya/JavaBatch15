package HomeWork9;

public class Task6 {
    public static void main(String[] args) {
        /*
        6)Write a program to swap 2 numbers without a temporary variable?
         */
        int a=5;
        int b=10;
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
}
