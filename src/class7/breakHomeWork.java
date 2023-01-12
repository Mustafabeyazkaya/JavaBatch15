package class7;

public class breakHomeWork {
    public static void main(String[] args) {
        // First way
        for (int num = 1; num <= 20; num++) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }
        System.out.println("**********************************************************");
        /*
         Second way
         This is also a way to get result for odd numbers but in my opinion this is a bad way, that's why you usually use the above coding as long as you can
         */
        for (int i = 1; i <= 20; i += 2) {
            System.out.println(i);
        }

    }
}