package class16;

import java.sql.SQLOutput;

public class SyntaxEmployeeTester {
    public static void main(String[] args) {
        System.out.println("***FIRST WAY***");
        SyntaxEmployee Asghar=new SyntaxEmployee();
        String eID=Asghar.empID="123";
        double Salary=Asghar.salary=300.000;
        System.out.println(eID);
        System.out.println(Salary);
        System.out.println(Asghar.CEO);
        System.out.println("***SECOND WAY***");
        System.out.println(Asghar.empID);
        System.out.println(Asghar.salary);
        System.out.println(Asghar.CEO);

        System.out.println("****************************");
        System.out.println("***FIRST WAY***");
        SyntaxEmployee Asel=new SyntaxEmployee();
        String eID1=Asel.empID="456";
        double Salary1=Asel.salary=500.000;
        System.out.println(eID1);
        System.out.println(Salary1);
        System.out.println(Asel.CEO);
        System.out.println("***SECOND WAY***");
        System.out.println(Asel.empID);
        System.out.println(Asel.salary);
        System.out.println(Asel.CEO);

    }
    }

