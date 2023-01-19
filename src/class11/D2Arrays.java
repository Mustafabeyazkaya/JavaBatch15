package class11;

import java.lang.reflect.Array;
import java.util.Arrays;

public class D2Arrays {
    public static void main(String[] args) {
        int [][] matrix={{10,20,30},
                         {45,55,66},
                         {30,40,20,10,25}
        };
        System.out.println(matrix[2][4]);
        System.out.println(Arrays.toString(matrix[0]));
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[0][i]);// to execute all indexes in first row of array
        }
        // if you wanna execute every single row one by one, you can use below method
        int [] firstRow=matrix[0];
        for (int i = 0; i < firstRow.length; i++) {
            System.out.print(firstRow[i]+" ");
        }
        System.out.println();
        int [] secondRow=matrix[1];
        for (int i = 0; i < secondRow.length; i++) {
            System.out.print(secondRow[1]+" ");
        }
        System.out.println();
        int [] thirdRow=matrix[2];
        for (int i = 0; i < thirdRow.length; i++) {
            System.out.print(thirdRow[i]+" ");
        }
        System.out.println();
    }
}
