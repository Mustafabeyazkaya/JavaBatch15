package class12;

public class StringDemo5 {
    public static void main(String[] args) {
        String str="Java";
        String str2="Java";
        boolean areEqual=str.equals(str2);
        System.out.println(areEqual);
        boolean areEqual2=str.equalsIgnoreCase(str2);
        System.out.println(areEqual2);
        System.out.println("***********");
        // this is false, Because 1 of them is written by uppercase letters
        String str3="Java";
        String str4="JAVA";
        boolean areEqual1=str3.equals(str4);
        System.out.println(areEqual1);
        System.out.println(str3.equalsIgnoreCase(str4));// this will be true because it ignores all the upp or low cases
    }
}
