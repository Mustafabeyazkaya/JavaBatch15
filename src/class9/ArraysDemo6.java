package class9;

public class ArraysDemo6 {
    public static void main(String[] args) {

        int [] numbers=new int[5]; // an empty array of size 5 will be created
        System.out.println(numbers[2]);// it will execute 0 because , we haven't assign any value in numbers yet, when you run all the codes at same time you will see 0 at the top bacause intellij work from top to bottom
        numbers[0]=50;
        numbers[1]=30;
        numbers[2]=55;
        numbers[3]=60;
        numbers[4]=52;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
