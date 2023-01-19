package class9;

public class ArraysDemo2 {
    public static void main(String[] args) {
        String [] names ={"Slava","Safi","Jason","Nabi","Anees","Joseph"};// it starts form 0, from left to right, slava is 0, safi is 1.
        // write a loop to print all the names from array
        System.out.println(names.length);
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }
    }
}
