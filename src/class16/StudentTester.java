package class16;

public class StudentTester {
    public static void main(String[] args) {
        Student student=new Student();
        student.name="Mustafa";
        student.ID="123";
        student.schoolName="Syntax";
        student.age=24;
        student.weight=70;

        Student student1=new Student();
        student1.name="Muhammed";
        student1.ID="456";
        //student1.schoolName="Syntax";
        student1.age=33;
        student1.weight=80;

        Student student2=new Student();
        student2.name="Muhammed";
        student2.ID="456";
        //student2.schoolName="Syntax";
        student2.age=33;
        student2.weight=80;

        System.out.println(student2.schoolName);
        System.out.println(Student.schoolName);// another way that you might see a lot to access static variable
        System.out.println(student2.name);


    }
}
