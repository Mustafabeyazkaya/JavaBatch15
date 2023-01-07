package class2;

public class VariableDemo2 {
    public static void main(String[] args) {
        int numberBox=10; // we dont need to define the data-types adain java remembers its
         numberBox=20;// we are reassigning number 20 to numberBox, so it will overwrite 10 with 20
        System.out.println(numberBox);
        numberBox=200;
        System.out.println(numberBox);
        numberBox=30;
        System.out.println(numberBox+20);




        int number=20;
        int number2=20;
        int number3=20;
        int number4=20;
        // to calculate or get a result you can use only 1 variable as example
        System.out.println(number*1);
        System.out.println(number*2);
        System.out.println(number*3);
        System.out.println(number*4);

        System.out.println("******");
        // or you can use all variable to calculate or get a result as example
        System.out.println(number*1);
        System.out.println(number2*2);
        System.out.println(number3*3);
        System.out.println(number4*4);
    }
}
