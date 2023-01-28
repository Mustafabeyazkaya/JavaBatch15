package class15;

public class MPractice3 {
    /*
    create a method that takes an array of integer,
    sum all the elements from the array and return the sum
     */
    int arraySum(int[] arr){
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        return sum;
    }
}
