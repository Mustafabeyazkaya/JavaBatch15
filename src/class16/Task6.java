package class16;

public class Task6 {
    //Write a method to return whether given number is prime or not?
    public static void main(String[] args) {
        Task6 inp = new Task6();
        System.out.println(inp.prime(5));
    }

   /* String isPrime(int num) {
        boolean flag=t
        if (num > 1) {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return num + " is not a prime number";
                } else {
                    return num+" is a prime number";
                }
            }
        } else {
            return num + " is not a Prime number";;
    }
    }*/
    boolean prime(int number){
        boolean flag=true;
        if (number>1){
            for (int i = 2; i < number; i++) {
                if (number%i==0){
                    flag = false;
                }else {
                    flag= true;
                }
            }
        }else {
            flag=false;
        }
        return flag;
    }

}
