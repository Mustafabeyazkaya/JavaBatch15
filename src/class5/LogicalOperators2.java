package class5;

public class LogicalOperators2 {
    public static void main(String[] args) {

        //(&&) means "AND"
        /*
        if the score in all the subjects are greater than 90, print brilliant student otherwise print you need to study harder
        -why should we learn about the logical operators?
        we can greatly simplify the logic if we use the operators
        -what is syntax?
        they only work with boolean data type
        if(! condition)
        if(condition1||condition2)
        if(condition1&&condition2)
        */
        double mathScore = 82.5;
        double historyScore = 91.5;
        double scienceScore = 93.5;
        /*
         if (mathScore>90.0){
         if (historyScore>90.0){
         if (scienceScore>90.0){
             System.out.println("You are brillant student");
         }else {
             System.out.println("You gotta study harder");
         }else {
            System.out.println("You gotta study harder");
         }else {
            System.out.println("You gotta study harder");
         }*/
        // instead of this, use the method above

        if (mathScore > 90 && historyScore > 90 && scienceScore > 90) {
            System.out.println("You are brilliant student");
        } else {
            System.out.println("You gotta study harder");
        }
    }
}
