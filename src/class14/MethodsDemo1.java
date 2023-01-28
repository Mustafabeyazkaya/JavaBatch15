package class14;

import java.util.Arrays;

public class MethodsDemo1 {
    public static void main(String[] args) {
        int [] numbers={10,20,30,45,50};
        int sum=0;
        for (int i = numbers.length-1; i >=0 ; i--) {
            sum+=numbers[i];
        }
        System.out.println(sum);
        System.out.println("***Second Way***");
        int [] num={10,20,30,45,50};
        int sum1=0;
        for (int i = 0; i < num.length; i++) {
            sum1+=num[i];
        }
        System.out.println(sum1);
        System.out.println("***Third Way***");
        int [] arr={10,20,30,45,50};
        int sum2=0;
        for (int a:arr) {
            sum2+=a;
        }
        System.out.println(sum2);
        //System.out.println(Arrays.toString(arr));// to see inside the array of arr as [numbers]
        int [] arr1={10,10,10,45,50};
        sum2=0;
        for (int a:arr1) {
            sum2+=a;
        }
        System.out.println(sum2);

    }
}
