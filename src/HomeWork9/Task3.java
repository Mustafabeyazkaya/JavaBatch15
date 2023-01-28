package HomeWork9;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix={{1,2,3},
                       {4,5,6,7},
                       {8,9,10,11,12}};
        int sum=0;
        for (int [] x:matrix) {
            for (int y:x) {
                sum=sum+y;
            }
        } System.out.println(sum);
        System.out.println("***Second Way***");
        int sum1=0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum1=sum1+matrix[i][j];
            }
        }
        System.out.println(sum1);
            }
}
