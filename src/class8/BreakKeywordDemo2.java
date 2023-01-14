package class8;

public class BreakKeywordDemo2 {
    public static void main(String[] args) {
        boolean summer = true;
        int temp = 75;
        while (summer) {
            if (temp <= 100) {
                System.out.println("I love summer, because temperature is " + temp);
            } else {
                System.out.println("it is very hot " + temp);
                break;
            }
            temp += 5;
        }
        System.out.println("***NEXT EXAMPLE***");
        int a=75;
        boolean sum=true;
        while (sum){
            if (a<=100){
                System.out.println("I love summer, because temperature is " + a);
            }else {
                System.out.println("it is very hot " + a);
                sum=false;
            }
            a+=5;
        }
        System.out.println("***NEXT EXAMPLE***");
        boolean summr=true;
        int emp=75;

        do {
            if (summr && emp<=100){
                System.out.println("I love summer, because temperature is " + emp);
            }
            emp+=5;

        }while (emp<=100);
        System.out.println("it is very hot " + emp);


    }
}


