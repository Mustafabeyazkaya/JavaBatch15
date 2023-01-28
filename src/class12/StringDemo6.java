package class12;

public class StringDemo6 {
    public static void main(String[] args) {
        // this method trim all the spaces which is from beggining and ending only, it does not trim the spaces between the words for example "j a v a", will be executed as j a v a
        String str="     java     ";
        System.out.println(str.trim());// java
        String str2="   j a v a    ";
        System.out.println(str2.trim());// j a v a
    }}

