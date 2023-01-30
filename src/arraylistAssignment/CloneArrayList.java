package arraylistAssignment;

import java.util.ArrayList;
public class CloneArrayList {
    public static void main(String[] args) {
        ArrayList<String> AL1 = new ArrayList<>();
        AL1.add("segun");
        AL1.add("funmi");
        AL1.add("mubarak");
        AL1.add("kenny");
        System.out.println("Original ArrayList : " + AL1);
        ArrayList<String> AL2 = (ArrayList<String>)AL1.clone();

        System.out.println("Cloned Arraylist : " + AL2);
    }
}