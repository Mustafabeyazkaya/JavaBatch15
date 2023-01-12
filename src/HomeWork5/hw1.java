package HomeWork5;

public class hw1 {
    public static void main(String[] args) {
        /*boolean workDay=true;
        int day=1;
        while (workDay){
            System.out.println("I need a day off");
            if (day<6)
        }*/
        boolean workDay = true;
        int day = 1;
        while (day < 6) {
            if (workDay) {
                System.out.println("I need a day off");
            }
            day++;
        }
        System.out.println("I don't need a day off any more");
        // there is another way to solve this question in the class 7 as a name that has homeWorkRecap, check that out
    }
}
