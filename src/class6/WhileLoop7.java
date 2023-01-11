package class6;

public class WhileLoop7 {
    public static void main(String[] args) {
        // print below sequence with the help off loop
        // 1 2 3 4 6 7 8 9 11 12 13 14 16
        int num=1;
        while (num<=16){
            if (num==5 || num==10 || num==15){

            }else {
                System.out.println(num);
        }num++;
    }
        System.out.println("***********************************************");
        // different way
        int num2=1;
        while (num2<=16) {
            if (num2%5!=0){
                System.out.println(num2);
            }
            num2++;
        }
}}
