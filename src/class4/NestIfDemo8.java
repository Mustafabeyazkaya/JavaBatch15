package class4;

public class NestIfDemo8 {
    public static void main(String[] args) {

        boolean studyHard=true;
        int salary=90000;

        if (studyHard){

            System.out.println("We get the jobs:");

            if (salary>100000){
                System.out.println("Lets buy a Tesla");
            }else {
                System.out.println("Lets keep getting in Nissan");
            }
        }else {
            System.out.println("you need to study more");
        }
    }
}
