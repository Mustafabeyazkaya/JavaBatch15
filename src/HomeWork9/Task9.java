package HomeWork9;

public class Task9 {
    public static void main(String[] args) {
        //9)Maximum and minimum number in the array?
        System.out.println("***1D ARRAYS***");
        int [] num={10,25,2,99};
        int max=num[0];
        int min=num[0];
        for (int i = 0; i < num.length; i++) {
            if (num[i]>max){
                max=num[i];
                System.out.println("This is the maximum number of inside this array "+max);
            }if (num[i]<min){
                min=num[i];
                System.out.println("This is the minimum number of inside this array "+min);
        }
        }

    }
}
