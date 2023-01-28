package class12;

public class StringDemo10 {
    public static void main(String[] args) {
        // This is help us to know the number of index of letters which we wanna know or it works for all word too
        String str="Java is not pain";
        System.out.println(str.indexOf("J"));
        System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("p"));
        System.out.println(str.indexOf("not"));
        System.out.println(str.indexOf("Java"));
        System.out.println("************");
        // if you wanna know all the letters numbers of indexes, we can use below method
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i)+ " has the index "+i);
        }

    }
}
