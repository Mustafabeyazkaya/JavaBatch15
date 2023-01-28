package class13;

public class ReplaceAllMethodDemo {
    public static void main(String[] args) {
        String str="kJDKJDZLMNOPFj452nfjdnf384834%^&*(*(()";
        System.out.println(str.replaceAll("[A-Z]","#"));//Uppercase
        System.out.println(str.replaceAll("[a-z]","#"));//Lowercase
        System.out.println(str.replaceAll("[0-9]","#"));//Numbers
        System.out.println(str.replaceAll("[A-Za-z]","#"));//Uppercase and Lowercase using not put - between
        System.out.println(str.replaceAll("[A-Za-z0-9]","#"));//Uppercase,Lowercase and Numbers using not put - between
        System.out.println(str.replaceAll("[^A-Za-z0-9]","#"));//to put "^" at beggining of the code you will be replacesing all symbols except Uppercase,Lowercase and Numbers("^" means is "not")
        System.out.println(str.replaceAll("[^A-Za-z0-9]",""));//to put nothing between "" gonna print nothing instead of thing which you want ta replace.

        System.out.println("****************************************************");
            String str1="kJDKJDZLMNOPFj452nfjdnf384834%^&((()";
            //replaces All upper case letters from A to Z
            System.out.println(str1.replaceAll("[A-Z]","#"));
            //replaces All lower case letters from a to z
            System.out.println(str1.replaceAll("[a-z]","#"));
            //replaces All lower case letters from 0 to 9
            System.out.println(str1.replaceAll("[0-9]","#"));
            //replaces All lower case letters from A-Z and lower case letters from a-z
            System.out.println(str1.replaceAll("[A-Za-z]","#"));
            //replaces All lower case letters from A-Z and lower case letters from a-z and numbers as well
            System.out.println(str1.replaceAll("[A-Za-z0-9]","#"));
            //Do not replace All lower case letters from A-Z and lower case letters from a-z
            System.out.println(str1.replaceAll("[^A-Za-z0-9]","#"));
    }
}
