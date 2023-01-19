package class9;

public class ArraysDemo3 {
    public static void main(String[] args) {
        int total=0;
       int [] numbers ={10,20,30,45,50};
       // write a loop to print all numbers from array
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            total=total+numbers[i];
        }
        System.out.println(total);

    }
}
