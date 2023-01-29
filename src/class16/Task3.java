package class16;

public class Task3 {
    //Create a method that will print whether given String is palindrome or not.
    public static void main(String[] args){
     Task3 inp=new Task3();
     //String result=inp.isPalindrome("Kaya"); // can't assign void methods to variable
        // System.out.println(inp.isPalindrome("Kaya"););// can't use void methods in PrintLn
        inp.isPalindrome("kaya");
        inp.isPalindrome("dad");

    }
    void isPalindrome(String str){
    StringBuilder st=new StringBuilder(str);
        st.reverse();
    String reservedStr=st.toString();
        if (str.equals(reservedStr)){
        System.out.println(str+" is palindrome");
    }else {
        System.out.println(str+" is not palindrome");
    }

}}