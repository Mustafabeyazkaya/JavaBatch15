package class9;

public class ArraysDemo {
    public static void main(String[] args) {
        String [] names ={"Slava","Safi","Jason","Nabi","Anees","Joseph"};// it starts form 0, from left to right, slava is 0, safi is 1.
        System.out.println(names [2]);
        System.out.println(names [0]);
        System.out.println(names [5]);
      //  System.out.println(names [500]); error bacuase there is no name on index number 500
       // System.out.println(names [-5]); error because index can't be negative

        // write a loop to print all the names from array
        System.out.println("************");
        for (int i = 0; i < 6; i++) {
            System.out.println(names[i]);
        }
    }
}
