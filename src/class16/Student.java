package class16;

public class Student {
    String name;
    String ID;
    static String schoolName;
    int age;
    double weight;
    void printName(){
        int ssn=1234567;
        System.out.println(name);
        System.out.println(schoolName);
    }
    static void printStudentInfo(){
        // System.out.println(name); // can't access here
        System.out.println(schoolName);
    }


}
