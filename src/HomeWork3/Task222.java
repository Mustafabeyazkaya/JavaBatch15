package HomeWork3;

public class Task222 {
    public static void main(String[] args) {
        double mortgageRate = 3.4;
        int mortgagePrice = 250000;
        if (mortgageRate >= 4.5) {
            System.out.println("You wont buy a house");

            if (mortgagePrice > 200000) {
                System.out.println("You will take a loan");
            } else {
                System.out.println("You will pay cash");
            }
        } else {
            System.out.println("You will consider to buy one");
        }
        int amountOfLoan = 300000;
        if (amountOfLoan <= 200000) {
            System.out.println("Your are good to take loan from us");
        } else {
            System.out.println("Sorry, We can not give u loan");
        }
        int age = 21;
        if (age >= 18) {
            System.out.println("You can get driver licence");
        } else {
            System.out.println("You need to get a learner permit to me");
        }


    }
}
