package my_summarize.section4_set_basics;

import java.util.ArrayList;

public class UsArrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList();
        al.add("abc");
        al.add("dbc");
        al.add("ecc");
        al.add("lbf");
        System.out.println(al);

        al.add(0,"uuu");
        System.out.println(al);

        al.remove("uuu");
        al.remove(2);
        System.out.println(al);

        System.out.println(al.get(0));
        System.out.println(al.size());

        al.set(0,"xyz");
        System.out.println(al);

    }
}
