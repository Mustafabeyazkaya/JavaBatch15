package class6;

public class WhileLoop6 {
    public static void main(String[] args) {

        boolean condition=true;

        int num=0;

        while (condition){
            System.out.println("Hello World");
            if (num>3){
            condition=false;
            }
            num++;
        }



        int number=0;
        while (number<10){
            if (number%2==0){
            System.out.println("Even "+number);
            }
            number++;
        }

    }
}
