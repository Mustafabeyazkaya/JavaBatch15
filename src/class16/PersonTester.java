package class16;

import java.util.Scanner;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person();
        //System.out.println(person.bankBalance);// this is not gonna work because this class does not have a private method inside
        System.out.println(person.Address);// this is not gonna work if you call it in the different package example(class15 can not run this)
        System.out.println(person.name);
        Scanner scanner=new Scanner(System.in);
        scanner.next();
    }
}
