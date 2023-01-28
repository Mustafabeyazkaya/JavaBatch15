package class15;

public class Dog1 {
    String name; // instance variable
    String breed;// instance variable
    String color;// instance variable

    static int noOfLegs=4;// static variable
    void nameOffood() {
        String food = "Meat";// local variable (void)
        System.out.println(food);
    }










    /*
    Summary:
In Java, variables can be classified into three types: local, instance, and static.
1.    Local Variables: Local variables are defined inside a method or block of code.
They are only accessible within the method or block of code where they are declared and are not visible outside of it.
They are also known as automatic or stack variables. They do not have a default value, so you must initialize them before using them.
2.    Instance Variables: Instance variables are defined in a class but outside of any method.
They are associated with an instance of the class and have a default value.
They can be accessed by any method in the class and are also known as non-static fields.
3.    Static Variables: Static variables are also defined in a class but outside of any method and are shared among all instances of the class.
They are associated with the class itself rather than any specific instance.
They can be accessed by any method in the class and are also known as class variables.
 They have a default value and can be accessed directly by calling className.variableName.
     */
}
