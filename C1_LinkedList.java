package Java_Collections_Framework;

import java.util.LinkedList;
import java.util.List;

public class C1_LinkedList {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list);

        list.add(4);  // This will add 4 at the end of the List.
        System.out.println(list);

        list.add(1, 50); // This will add 5 at index 1.
        System.out.println(list);

        List<Integer> newlist = new LinkedList<>(); // new array list create

        newlist.add(10);
        newlist.add(20);

        list.addAll(newlist);
        System.out.println(list);

        System.out.println(list.get(1)); // get address array 0 to n-1
    }
}
