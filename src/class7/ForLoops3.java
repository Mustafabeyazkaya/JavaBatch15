package class7;

public class ForLoops3 {
    public static void main(String[] args) {
        // 1 2 4 5 7 8 10;
        for (int num=1;num<=10;num++) {
            if (num%3!=0){
                System.out.println(num);
            }
        }
        System.out.println("******************************");
        // 1 2 4 5 7 8 10 11 13 14 16 17 19
        for (int i=1;i<20;i++){
            if ((i%3!=0)){
                System.out.println(i);
            }
        }

    }  }