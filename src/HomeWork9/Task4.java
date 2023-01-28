package HomeWork9;

public class Task4 {
    public static void main(String[] args) {
        int[][] matrix = {{2, 4, 6},
                {1, 3, 5}};
        for (int[] x : matrix) {
            for (int y : x) {
                if (y % 2 == 0) {
                    System.out.print(y + " ");
                }
            }
            System.out.println();
        }
        System.out.println("***Second Way***");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] % 2 == 0) {
                    System.out.print(matrix[i][j] + " ");
                } else {
                    System.out.print(matrix[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println("***Third Way***");
        int[][] numbers = {{11, 23, 45, 79},
                {22, 34, 56, 48}};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    System.out.print(numbers[i][j] + " ");
                } else {
                    System.out.print(numbers[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
