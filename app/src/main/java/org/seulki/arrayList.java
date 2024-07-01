package org.seulki;

import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        dong dong1 = new dong("최동인",13,"존잘러");

        ArrayList<dong> dong2 = new ArrayList<>();

        dong2.add(dong1);

        for (dong d : dong2) {
            System.out.println(d.name + "\t" + d.age+ "\t"  + d.content);
        }

       dong2.removeIf(dong -> dong.content.equals("못생김"));

        for (dong d : dong2) {
            System.out.println(d.name + "\t" + d.age+ "\t"  + d.content);
        }

        dong2.removeIf(dong -> dong.content.equals("존잘러"));

        for (dong d : dong2) {
            System.out.println(d.name + "\t" + d.age+ "\t"  + d.content);
        }

    }
}
