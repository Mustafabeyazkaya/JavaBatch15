package class15;

public class MethodPractice2 {
    // create a method that takes a String reverse it and return the reversed String
   // call the method reverseStr
   String reverseStr(String str){
       String newStr="";
       for (int i = str.length()-1; i >=0; i--) {
           newStr+=str.charAt(i);
       }
       return newStr;
   }
   String reverseStr1 (String str1){
       return new StringBuilder(str1).reverse().toString();
   }
    String reverseStr2(String str2){
        StringBuilder stringBuilder=new StringBuilder(str2);
        stringBuilder.reverse();
        return stringBuilder.toString();
    }
}
