package class9;

public class ArraysDemo5 {
    public static void main(String[] args) {
        char [] letters={'A','B','c','d','e','F'};
        letters[0]='z'; // updating the element at index 0, normally 0 has "A" but i changed "A" to "z"
        for (int i = 0; i < letters.length; i++) {
            System.out.println(letters[i]);
        }
    }
}
