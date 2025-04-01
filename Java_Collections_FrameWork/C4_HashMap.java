package Java_Collections_Framework;

import java.util.HashMap;
import java.util.Map;

public class C4_HashMap {

    public static void main(String[] args) {

        Map<String, Integer> numbers = new HashMap<>(); // key: us --> value: United States

        numbers.put("One", 1);
        numbers.put("Two", 2);
        numbers.put("Three", 3);
        numbers.put("Four", 4);
        numbers.put("Five", 5);

        numbers.remove("Three");

        if(!numbers.containsKey("Six")){ //check
            numbers.put("Six", 23);
        }
        System.out.println(numbers);

    }

}
