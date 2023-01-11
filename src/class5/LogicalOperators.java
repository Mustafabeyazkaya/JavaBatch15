package class5;

public class LogicalOperators {
    public static void main(String[] args) {
        //we can use logicaloperator with only boolean
        //Just another set of symbols that we use to combine multiple boolean values.There are 3 logical operators.(! , || , &&)
        /* (!) is using for changing the answer to negative
        example: System.out.println(!true); will be "false"
                 System.out.println(!false); will be "true"
                 */
        boolean rich=true;
        System.out.println(!rich);
        int number=9;
        if (number==9){
            System.out.println("Hello world");
        }
        if (number==1){
            System.out.println("Hello world");
        }
        String country="China";
        if (!country.equals("BadCountry")){
            System.out.println("You are welcome");
        }
        if(country.equals("China")){
            System.out.println("You are welcome");
        }

        if(country.equals("Nepal")){
            System.out.println("You are welcome");
        }

        if(country.equals("Pakistan")) {
            System.out.println("You are welcome");
        }
    }
}
