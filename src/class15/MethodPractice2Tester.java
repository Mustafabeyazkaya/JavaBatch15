package class15;

import class14.MethodsDemo2;

public class MethodPractice2Tester {
    public static void main(String[] args) {
        MethodPractice2 inp=new MethodPractice2();
        String a= inp.reverseStr("Fenerbahce");
        System.out.println(a);
        System.out.println(inp.reverseStr("Mustafa"));
        System.out.println(inp.reverseStr("Wednesday"));
        System.out.println(inp.reverseStr("kayak"));
    }
}
