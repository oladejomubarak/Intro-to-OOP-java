package arraylistAssignment;

import java.util.ArrayList;

public class ReplaceElementInArrayList {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("segun");
        al1.add("funmi");
        al1.add("mubarak");
        al1.add("kenny");
        System.out.println("Original ArrayList : " + al1);
        al1.add(1, "messi");
        System.out.println("After replacement: " + al1);
        for (int i = 0; i < al1.size(); i++) {
            System.out.println((i + 1)+ " contains "+al1.get(i));
        }
    }
}
