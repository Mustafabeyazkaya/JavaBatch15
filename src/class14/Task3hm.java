package class14;

public class Task3hm {
    public static void main(String[] args) {
        //You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
        // How would you find out how many sentences are in that String?
        String a="Is it saturday? Is it raining? Do we have a Java Class today?";
        String [] arr=a.split("[?]");
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println("***Second Way***");
        System.out.println(a.split("[?]").length);// to know how many seperated sentences in the sentence
    }

}
