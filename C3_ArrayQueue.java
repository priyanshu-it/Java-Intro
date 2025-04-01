package Java_Collections_Framework;
import java.util.LinkedList;
import java.util.Queue;

public class C3_ArrayQueue {
    public static void main(String[] args) {

        Queue<Integer> book = new LinkedList<>();

        book.offer(10);
        book.offer(20); // book.offer(String.valueOf("Priyanshu"));
        book.offer(30);

        System.out.println(book);

        book.poll(); // book.remove();
        // System.out.println(book.poll());

        System.out.println(book);
        System.out.println(book.peek()); // next element print show or System.out.println(book.element());
    }
}

//  *****************************************************************
//  First In First Out;  Queue is : [ 1 2 3 ]
