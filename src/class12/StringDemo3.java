package class12;

public class StringDemo3 {
    public static void main(String[] args) {
        String firstName="Mustafa";
        String lastName="Beyazkaya";
        String fullName=firstName+" "+lastName;
        System.out.println(firstName+" "+lastName+" "+"first and easiest way");
        System.out.println(fullName+" "+"Second way");
        System.out.println(firstName.concat(" "+lastName)+" "+"Third way");
    }
}
