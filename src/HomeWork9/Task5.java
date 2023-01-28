package HomeWork9;

public class Task5 {
    public static void main(String[] args) {
        int [][] numbers={{10,15,17},
                {21,24,28,37}};
        int sumOdd=0;
        int sumEven=0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j]%2==0){
                    sumEven=sumEven+numbers[i][j];
                }else{
                    sumOdd=sumOdd+numbers[i][j];
                }
            }
        }
        System.out.println("This is sum of Odd numbers "+sumOdd);
        System.out.println("And This is sum of Even numbers "+sumEven);
        System.out.println("***SECOND WAY***");
        int sumOdd1=0;
        int sumEven1=0;
        for (int [] x:numbers) {
            for (int y:x) {
                if (y%2==0){
                    sumEven1=sumEven1+y;
                }else {
                    sumOdd1=sumOdd1+y;
                }

            }
        }
        System.out.println("This is sum of Odd numbers "+sumOdd1);
        System.out.println("And This is sum of Even numbers "+sumEven1);
    }
}
