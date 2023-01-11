package class5;

public class LogicalOperators1 {
    public static void main(String[] args) {
        // all LogicalOperator work only with boolean
        // (||) using for conbineting
        // (||) means OR
        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||false);
        boolean boughtCho=true;
        boolean boughtFlowers=true;
        if (boughtCho||boughtFlowers){
            System.out.println("I am happy");
        }else {
            System.out.println("i am sad");
        }
        boolean wifi=true;
        boolean FiveG=true;
        if (wifi||FiveG){
            System.out.println("You are good to browse in internet");
        }else {
            System.out.println("either connect to wifi or to 5G");
        }
    }
}
