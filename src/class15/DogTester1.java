package class15;

public class DogTester1 {
    public static void main(String[] args) {
        System.out.println("Start");
        Dog1 dog=new Dog1();
        dog.nameOffood();
        System.out.println("End");

        for (int i = 0; i <2 ; i++) {
            System.out.println(i);
        }
       // System.out.println(i); can't use outside of block

    }
}
