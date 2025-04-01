package Java_Collections_Framework;
import java.util.ArrayList;
import java.util.*;

public class C5_CollectionClass {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(25);
        list.add(24);
        list.add(45);

        Collections.sort(list);
        System.out.println(list);

        System.out.println("min " + Collections.min(list));
        System.out.println("max " + Collections.max(list));
        System.out.println(Collections.frequency(list, 1));

        Collections.sort(list, Comparator.reverseOrder());
        System.out.println(list);

    }
}
