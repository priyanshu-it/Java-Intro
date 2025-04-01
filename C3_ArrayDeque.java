package Java_Collections_Framework;

import java.util.ArrayDeque;
import java.util.Queue;

public class C3_ArrayDeque {

    public static void main(String[] args) {
//        Queue<Integer> ad = new ArrayDeque<>();
//        ad.offer(1);
//        ad.offer(2);
//        System.out.println(ad);
//        System.out.println(" ");

        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.offerFirst(40);
        ad1.offerLast(30);
        ad1.offer(20);
        System.out.println(ad1);

        System.out.println(" ");
        System.out.println(ad1.peekFirst());
        System.out.println(ad1.peekLast());

//        System.out.println(ad1.poll());
//        System.out.println("poll" + ad1);
//        System.out.println(ad1.peek());

        System.out.println(ad1.pollFirst());
        System.out.println("poll1() " + ad1);

        System.out.println(ad1.peekLast());
        System.out.println("pollLast() " + ad1);

    }
}


