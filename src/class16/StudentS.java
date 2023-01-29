package class16;

public class StudentS {
    /*
    Create a Class called Students
    Create three  variables  Name , ID  and  numberOfStudents
    Create three objects of the Students Class
    Set the value for  studentName , studentID and increment  the numberOfStudents for each object
    Print out  total number of students
     */
    public static void main(String[] args) {
        System.out.println("***FIRST WAY***");
        StudentS student1=new StudentS();
        student1.name="Mustafa";
        student1.ID="123";
        student1.numberOfStudents++;
        System.out.println(student1.name);
        System.out.println(student1.ID);
        System.out.println(student1.numberOfStudents);


        System.out.println("***SECOND WAY***");
        String a=student1.name="Mustafa";
        String b=student1.ID="123";
        int c=student1.numberOfStudents++;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println("********************");


        System.out.println("***FIRST WAY***");
        StudentS student2=new StudentS();
        student2.name="Muhammed";
        student2.ID="456";
        student2.numberOfStudents++;
        System.out.println(student2.name);
        System.out.println(student2.ID);
        System.out.println(student2.numberOfStudents);


        System.out.println("***SECOND WAY***");
        String a1=student2.name="Muhammed";
        String b1=student2.ID="456";
        int c1=student2.numberOfStudents++;
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);
    }
    String name;
    String ID;
    static int numberOfStudents;

}
