package arraylistAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<String> AL1 = new ArrayList<>();
        AL1.add("segun");
        AL1.add("funmi");
        AL1.add("mubarak");
        AL1.add("kenny");
        System.out.println(AL1);

        ArrayList<String> al2 = new ArrayList<>();

        for (int i = AL1.size() - 1; i >= 0; i--) {
            al2.add(AL1.get(i));
        }

        System.out.println(al2);
    }
}