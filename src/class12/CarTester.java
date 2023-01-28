package class12;

public class CarTester {
    public static void main(String[] args) {
        // Create the object of the class
        Car bmw=new Car();
        bmw.make="BMW";
        bmw.model="I7";
        bmw.color="Grey";
        bmw.year=2023;
        bmw.moveForward();



        /*
        public static void main & void moveForward () ; are both methods.
         Whenever we are inside of the method, the sequence matters.
         When we are inside of the class, the sequence does not matter.
         */
    }
}
