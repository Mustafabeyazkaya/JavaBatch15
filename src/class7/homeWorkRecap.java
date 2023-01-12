package class7;

public class homeWorkRecap {
    public static void main(String[] args) {
        boolean workDay=true;
        int day=1;
        while (workDay) {
            if (day<=5){
                System.out.println("I need a day off");
            }else {
                System.out.println("i don't need a day off anymore");
                workDay=false;
            } day++;
        }
    }
}
