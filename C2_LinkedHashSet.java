package Java_Collections_Framework;

import java.util.LinkedHashSet;
import java.util.Set;

public class C2_LinkedHashSet {

    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>(); // not repeat value

        set.add(32);
        set.add(2);
        set.add(54);
        set.add(21);
        set.add(65);
//      set.add(2);     // not repeat

        System.out.println(set);

        set.remove(2);

        System.out.println(set);

        System.out.println(set.contains(1));

        System.out.println(set.isEmpty());

        System.out.println(set.size());

        set.clear();

        System.out.println(set);

    }
}