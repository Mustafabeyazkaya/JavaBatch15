package class4;

public class IfElseIfConditionDemo3 {
    public static void main(String[] args) {
        int day=5;// to use = only one time means is assign a value to a variable

        if (day==1){// to use = 2 times means is we compare two values
            System.out.println("Monday");// If Block
        }else if (day==2){
            System.out.println("Tuesday");// Else Block
        } else if (day==3) {
            System.out.println("Wednesday");
        } else if (day==4) {
            System.out.println("Thursday");
        } else if (day==5) {
            System.out.println("Friday");
        } else if (day==6) {
            System.out.println("Saturday");
        } else if (day==7) {
            System.out.println("Sunday");
        }else {
            System.out.println("Please enter a day between 1 and 7");
        }
    }
}
