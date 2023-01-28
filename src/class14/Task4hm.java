package class14;

public class Task4hm {
    public static void main(String[] args) {
        /*
        4) How would you reverse a String word by word? for example
        //        // input=>This is sentence i want to reverse
        //        // output=>sihT si ecnetnes i tnaw ot esrever
         */
        /*
        for(String word:arr){
            StringBuilder st=new StringBuilder(word);
            st.reverse();
            System.out.print(st);
            System.out.print(" ");
        }
         */
        StringBuilder a=new StringBuilder("This is sentence i want to reverse");
        System.out.println(a.reverse());// this method reverse all the sentence all the way
        String b=a.toString(); // converting a StringBuilder to String so that we can call methods from String


        System.out.println("***Second Way By Using Only String");
        String str="This is sentence i want to reverse";
        String [] arr=str.split(" ");
        for (String word:arr) {
            for (int i = word.length()-1; i >=0 ; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        }

        System.out.println("***Third Way***");
        String c="This";
        for (int i = c.length()-1; i >=0 ; i--) {
            System.out.print(c.charAt(i));
        }

    }
}
