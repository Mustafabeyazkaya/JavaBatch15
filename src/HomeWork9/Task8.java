package HomeWork9;

public class Task8 {
    public static void main(String[] args) {
        int num1=0, num2=1 ,count=10, num3;
        System.out.print(num1+" "+num2+" ");
        for (int i = 2; i < count; i++) {
            num3=num1+num2;
            System.out.print(num3+" ");
            num1=num2;
            num2=num3;
        }

    }
}
