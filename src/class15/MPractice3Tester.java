package class15;

public class MPractice3Tester {
    public static void main(String[] args) {
        /*
        create te object of the class that has the method objectname.methodname
         */
        MPractice3 inp=new MPractice3();
        int [] a={10,20,30};
        System.out.println(inp.arraySum(a));
        System.out.println(inp.arraySum(new int[]{10,10,10}));

        /*
        you can do like this System.out.println(sum.col(new int[]{3, 2, 35}));
         */

    }
}