package Java_Collections_Framework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class C3_PriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();  // Small to big element (hash min)
        pq.offer(15);
        pq.offer(13);
        pq.offer(14);
        System.out.println(pq);

        // pq.poll();
        System.out.println(pq.poll());
        System.out.println(pq);

//step 2
        Queue<Integer> pq2 = new PriorityQueue<>(Comparator.reverseOrder()); // hash max

        pq2.offer(5);
        pq2.offer(3);
        pq2.offer(8);
        System.out.println(pq2);
        System.out.println(pq2.poll());
        System.out.println(pq2);

    }
}
