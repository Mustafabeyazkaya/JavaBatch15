package class3;

public class VariablesDemo_2 {
    public static void main(String[] args) {
        /* to rename something, right-click refactor->rename
        First you rename it after data type, and then you go into the sout(right click on the name, refactor, rename) */
        int age = 10;
        System.out.println(age);
        age = 20;
        System.out.println(age);
        int number = 10;
        age = number; // i am saying to java replace the value of age with value of number variable
        System.out.println(age);
        age = number + 10;
        System.out.println(age);
        age = age + 20; //
        System.out.println(age);
    }
}
