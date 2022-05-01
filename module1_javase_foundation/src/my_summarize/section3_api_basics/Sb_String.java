package my_summarize.section3_api_basics;

public class Sb_String {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append(1).append("one").append(true);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.toString());

        System.out.println(sb.insert(0,"StringBuilder"));
    }
}
