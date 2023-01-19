package class10;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {
        int [] arr={10,13,20,25,45,50};
        /*arr[1]=0;  this is how we update a single element in an array*/

        for (int i = 0; i < arr.length; i++) {
            if (arr[i]%2!=0){
                System.out.println(arr[i]);
            }
        }
        System.out.println("***SOLUTION OF FOREACHLOOP***");
        int [] arr1={10,13,20,25,45,50};
        for (int i:arr1) {
           if (i%2!=0){
               System.out.println(i);
           }
        }
        System.out.println("****REPLACE ALL ODD NUMBERS WITH 0 IN THE LINE" );
        int [] arr2={10,13,20,25,45,50};
        for (int j = 0; j < arr2.length; j++) {
            if (arr2[j]%2!=0){
                arr2[j]=0;
            }
            System.out.println(arr2[j]);
        }
    }
}
