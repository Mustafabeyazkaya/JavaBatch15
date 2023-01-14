package class8;

public class ContunieKeywordDemo1 {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++){

            if (i%3==0){
                continue; // skip keyword
            }else {
                System.out.println(i);
            }
            System.out.println("Hello Java");
        }

        System.out.println("****Next Solution****");

        for (int i = 0; i < 10; i++){

            if (i%3!=0){
                System.out.println(i);
                System.out.println("Hello Java");
            }
        }


    }
}
