package class12;

public class StringDemo9 {
    public static void main(String[] args) {
        String str="dfssf 35416 ^&^$&^%";
        int counter=0;
        int counterDigit=0;
        int counterSymbol=0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isAlphabetic(str.charAt(i))){
            counter++;
            }else if (Character.isDigit(str.charAt(i))){
                counterDigit++;
            }else {
                counterSymbol++;
            }
        }
        System.out.println("Total isAlphabetic in str is "+counter);
        System.out.println("Total Digit in str is "+counterDigit);
        System.out.println("Total Symbols in str is "+counterSymbol);
    }
}
