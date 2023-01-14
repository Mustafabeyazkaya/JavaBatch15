package class8;

public class NestedLoops1 {
    public static void main(String[] args) {
        for (int i = 0; i<5; i++){ // outer for loop

            for (int o = 0; o<5; o++){ // inner for loop
                System.out.println(o);
            }
            System.out.println("This is "+i+" .\\Line");
        }
        System.out.println("***NEXT EXAMPLE***");

        for (int a = 0; a<5; a++){ // outer for loop

            for (int b = 0; b<5; b++){ // inner for loop
                System.out.println("a = "+a+" b = "+b);
            }
            System.out.println("This is "+a+" .\\Line");
        }
        System.out.println("***NEXT EXAMPLE***");

    }
}
