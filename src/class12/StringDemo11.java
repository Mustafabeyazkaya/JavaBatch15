package class12;

public class StringDemo11 {
    public static void main(String[] args) {
        // this method help us to know a part of sentences
        String str="Send it to support channel. More java";
        // returns the new String from this index
        String newStr=str.substring(5);
        System.out.println(newStr);
        String newStr1=str.substring(11);
        System.out.println(newStr1);
        // below method help us to get part from first index to last index that we wanna know
        // we can also specify the starting point and the ending point
        System.out.println(str.substring(0,27));// this is gonna print "Send it to support channel." only, because we want
    }
}
