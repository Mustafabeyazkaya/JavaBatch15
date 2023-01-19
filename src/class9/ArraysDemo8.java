package class9;

public class ArraysDemo8 {
    public static void main(String[] args) {
        // create an array and store 10,20,30,4,5,6,7,80
        // add all the element which are multiple of 2
        int multoftwo=0;
        int [] num={10, 20,30,4,5,6,7,80};
        for (int j = 0; j < num.length; j++) {
            System.out.println(num[j]);
            if (num[j]%2==0){
                multoftwo=multoftwo+num[j];
            }
        }
        System.out.println(multoftwo);
    }
}
