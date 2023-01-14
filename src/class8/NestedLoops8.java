package class8;

public class NestedLoops8 {
    public static void main(String[] args) {
        /*
        0 1 2 3 4 5
         1 2 3 4 5
         2 3 4 5
         */
       // first way to solve
        for (int i =0; i<3; i++){
            if (i==0){
                for (int j =0; j<=5; j++){
                    System.out.print(j+" ");
                }
            }else if (i==1){
                for (int j =1; j<=5; j++){
                    System.out.print(j+" ");
                }
            }else if (i==2){
                for (int j =2; j<=5; j++){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
        System.out.println("***NEXT SOLUTION***");
        for (int i =0; i<3; i++){
            for (int j=0;j<=5;j++){
                if (i==1&&j==0||i==2&&j==0||i==2&&j==1){
                    continue;
                } System.out.print(j+" ");
            }
            System.out.println();
        }
        System.out.println("***NEXT SOLUTION***");
        // best way
        for (int i = 0; i < 3; i++) {
            for (int j = i; j <=5; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }




    }
}
