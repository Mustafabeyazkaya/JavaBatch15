package class2;

public class Variable2 {
    public static void main(String[] args) {
        /* the store some info or number you gotta typre "int" and put your notes in there,
        below line is reserving a box in the computer memory. we are calling it if we need the info that we are storing inside this box,  we can simple say to computer give us the contents of box1,
        box1 is the name of box,example is below
         */
        int box1=10;
        System.out.println(box1);
        // that means bring the contents of box1 and print them on the console
        // to store whole numbers (numbers without decimals points) we have 4 different tye of boxes. for example numbers like 10 20 3000 100000 330000
        // 1) byte 2) short 3) int 4) long
        byte box2= 127; // range for nyte is from -128 to 127 if we need to store larger numbers we should try to put shot at beggining of code
        byte box3= -128;
        short box4= 32767;
        int biggerbox5= 123456484;
        // most commend type of box.
        long maxBox=51445665525l;
        short mybox=10000;
        System.out.println(mybox);
        }

}
