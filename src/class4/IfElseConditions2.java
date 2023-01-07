package class4;

import class3.IfElse_10;

public class IfElseConditions2 {
    public static void main(String[] args) {
        boolean rain=true;

        if (rain){
            System.out.println("Lets take an umbrella");
        } else{
            System.out.println("go to shopping");
        }
        // create a boolean variables call it break. if it ontains true print lets take the break otherwise
        // it should print lets continue the class
        boolean breakTime=true;
        if (breakTime){
            System.out.println("Lets take a break");
        }else{
            System.out.println("Lets contunie the class");
        }

        String time="11:50 AM";
        if (time.equals("11:50 AM")){
            System.out.println("Lets back to class");
        }else{
            System.out.println("keep having break");
        }
    }
}
