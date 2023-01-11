package class6;

public class WhileLoop {
    public static void main(String[] args) {
        /*int number = 0;
        if (number < 3) {
            System.out.println("Hello World");
        }
        number++;
        if (number < 3) {
            System.out.println("Hello World");
        }
        number++;
        if (number < 3) {
            System.out.println("Hello World");
        }*/
        // instead of this use method below:
        int number2=0;
        while (number2<3) {// keeps on checking the condition as long as it returns true
            System.out.println("Hello World");
            number2++;// increments the number2 by one
        }
    }
}