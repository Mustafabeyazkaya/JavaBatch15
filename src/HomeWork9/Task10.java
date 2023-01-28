package HomeWork9;

public class Task10 {
    public static void main(String[] args) {
        //10)Write a java program to find the second largest number in the array?
        int [] numbers={10,52,41,88};
        int large=numbers[0];
        int secondlarge=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>large){
                large=numbers[i];
            } else if (large>secondlarge) {
                secondlarge=large;
            }
        }
        System.out.println(secondlarge);

    }
}
