package class12;

public class Task6 {
    public static void main(String[] args) {
        /*
        Create 2D array of countries: north america countries, south america countries,
europe countries, asian countries, african countries.
Then print all values from that array using 2 different loops and
calculate how many total countries been stored.
         */
        String [][] countries={{"Mexico","Canada","USA"},
                {"Brazil", "Argentina", "Peru", "Colombia", "Chile"},
                {"Germany","United","Kingdom","France","Spain"},
                {"China","India","Japan","Russia"},
                {"Egypt","Nigeria","South Africa","Ethiopia"}};
        int counter=0;
        for (int i = 0; i < countries.length; i++) {
            for (int j = 0; j < countries[i].length; j++) {
                System.out.print(countries[i][j]+" ");
                counter++;
            }
            System.out.println();
        }
        System.out.println("Total countries "+counter);
        System.out.println("***FOREACH LOOP EXAMPLE***");
        int sum=0;
        for (String[] country:countries) {
            for (String S:country) {
                System.out.print(S + " ");
                sum++;
            }
            System.out.println();
        }
        System.out.println("Total countries "+ sum);
    }
}
