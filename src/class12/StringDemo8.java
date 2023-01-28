package class12;

public class StringDemo8 {
    public static void main(String[] args) {
        String str="Java is love";
        char c=str.charAt(2);
        System.out.println(c);
       for (int i=0;i<str.length();i++){
           System.out.print(str.charAt(i));
           }
        System.out.println();
        System.out.println("***********");
        // to find or calculate how many letters which you wanna know in the sentences , use this method
       int countera=0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='a'){
                countera++;
            }
        }
        System.out.println(countera);
       }
    }

