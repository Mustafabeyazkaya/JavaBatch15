package class8;

import class7.ForLoops;

public class NestedLoops7 {
    public static void main(String[] args) {
        /*
        1 2 3 4 5
        1 2 3 4 5
        1 2 3 4 5
         */
        for (int i=1; i<=3; i++){ // executes the below code 3 times

            for (int j =1; j<=5; j++){
                System.out.print(j+" "); // prints the value of J from 1 to 5
            }
            System.out.println( );
        }
        System.out.println("****************************");





        /*
       1 2 3 4 5 6

       1 2 3 4 5 6

       1 2 3 4 5 6
         */

        for (int i=1;i<=3;i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
