package class12;

public class StringDemo4 {
    public static void main(String[] args) {
        String str="      ";
        boolean isEmpy=str.isEmpty();
        System.out.println(isEmpy);

        System.out.println(str.isBlank());







        /*
        Both isEmpty and isBlank are used to check if a string is empty or contains only whitespace characters, but they work slightly differently.

isEmpty checks if a string has a length of 0, meaning it contains no characters. It returns true for an empty string "" and false for a string containing only whitespace " ".

isBlank checks if a string is empty or contains only whitespace characters. It returns true for an empty string "" and a string containing only whitespace " ".
         */
    }
}
