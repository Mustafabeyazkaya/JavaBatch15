package class8;

public class RecapDemo1 {
    public static void main(String[] args) {
        //first way
        for (int i=10;i>=1;i--){
            if (i%2==0)
            System.out.println(i);
        }
        //second way
        int a =10;
        while (a>=1){
                System.out.println(a);
            a-=2;
        }
        //third way
        int num=10;
        do {
            System.out.println(num);
            num=num-2;
        }while (num>=1);

    }
}
