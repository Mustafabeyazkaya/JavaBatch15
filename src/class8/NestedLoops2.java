package class8;

public class NestedLoops2 {
    public static void main(String[] args) {
        for (int i = 0; i<5; i++){ // outer for loop

            for (int o = 0; o<5; o++){ // inner for loop
                System.out.println("i = "+i+" o = "+o);
            }
            System.out.println("**********");
        }


    }
}
