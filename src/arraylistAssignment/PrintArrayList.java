package arraylistAssignment;

import java.util.ArrayList;

public class PrintArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("segun");
        names.add("funmi");
        names.add("mubarak");
        names.add("kenny");
        for (int j = 0; j < names.size(); j++) {
            System.out.println(j + 1 + " = " + names.get(j));
        }
    }
}