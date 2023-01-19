package HomeWork7;

public class Task6 {
    public static void main(String[] args) {
        for (int i = 0; i <9; i++) {
            if (i==2 || i==4){
               continue;
            } else if (i%2==0) {
                System.out.print("**");
            }else{
            System.out.print("*");}
        }
        System.out.println();
    }
}
