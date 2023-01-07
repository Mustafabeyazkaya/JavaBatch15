package class3;

public class RelationalOperators_6 {
    public static void main(String[] args) {
        /*
        Arithmetic operators
        int+int=int
        int*int=int
        int/int=int
         */
        /*
        Relational operators
        >        means greater than
        <        means less than
        >=       means greater or equal
        ==       means equal to
        !=       means not equal to
        <=       means equal or less than
         */
        int number=10;
        int number2=20;
        System.out.println(number+number);
        boolean result=20>10;
        System.out.println(result);


        System.out.println(20>10); // is 20 greater than 10=> true
        System.out.println(5>10); // is 5 greater than 10=> false
        System.out.println(5!=10); //is 5 not equal to 10 => true
        System.out.println(5==10); // is 5 equal to 10 => false
        System.out.println(5==5); // is 5 equal to 5 => true
        System.out.println(10>=20); // is 10 greater than or equal to 20 =>false
        System.out.println(10<=20); // is 10 equal or less than 20 => true
        System.out.println(10<=10); // is 10 equal or less than 10 => true

    }
}
