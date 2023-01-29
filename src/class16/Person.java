package class16;

public class Person {

    /*
    Private= you can only access it within the same class
    Default = cant access in different package
     */
    private double bankBalance=1250000;// this private keywords works only in the same class,
    String Address="Street 123";// default access level is applied
    public String name="John Snow";//you can access this public in the anywhere ( any classes any packages)

    private void printPhonePassword(){
        System.out.println("pass123");
    }
    void printSSN(){
        System.out.println("12345678");
    }
    public void printTiktokAccount(){
        System.out.println("user123");
    }
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println(person.bankBalance);// does not work in other class and package
        System.out.println(person.Address);// works in anywhere
        System.out.println(person.name);//works in anywhere
        person.printPhonePassword();//does not work in another class and package
        person.printSSN();//works in another class but not in another package
        person.printTiktokAccount();// works in anywhere
    }
/*
Summary:
In Java, access modifiers are keywords used in class, method, and variable declarations that determine the level of access to the members of a class. The four access modifiers in Java are:
1.    public - The member can be accessed from anywhere.
2.    protected - The member can be accessed within the same package and by subclasses in other packages.
3.    default (no keyword) - The member can be accessed within the same package.
4.    private - The member can only be accessed within the same class.
 */

}
