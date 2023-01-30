package arraylistAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListCopy {
    public static void main(String[] args) {
            ArrayList<String> al1 = new ArrayList<>();
            al1.add("segun");
            al1.add("funmi");
            al1.add("mubarak");
            al1.add("kenny");

            ArrayList<String> al2 = new ArrayList<>();
            al2.addAll(al1);
            al2.add("minion");

            System.out.println("Original ArrayList : " + al1);
            System.out.println("Duplicated Arraylist : " + al2);

        }
    }

