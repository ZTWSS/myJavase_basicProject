package my_summarize.section3_api_basics;

public class demo {
    public static void main(String[] args) {
        String s = new String();
        System.out.println(s);

        char[] chr = {'a','b','c'};
        String s1 = new String(chr);
        System.out.println(s1);

        String s2 = new String("abc");
        System.out.println(s2);

        String s3 = "abc";
        System.out.println(s3);

        System.out.println(s1 == s2);
        System.out.println(s2 == s3);
        System.out.println(s1 == s3);
    }
}
