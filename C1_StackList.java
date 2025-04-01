package Java_Collections_Framework;
import java.util.Stack;

public class C1_StackList {
    public static void main(String[] args) {
        Stack<String> book = new Stack<>();
        book.push("1.Core Java"); // push (add element)
        book.push("2.Data Structure");
        book.push("3.Communication Skills");

        System.out.println("book name is " + book);
        System.out.println(book.peek()); // see element 
        book.pop(); // exit element Communication Skills

        System.out.println("book name is " + book);
        System.out.println(book.peek());
        book.pop(); // Data Structure

        System.out.println("book name is " + book);
        System.out.println(book.peek());
        book.pop(); //Core Java

        System.out.println("book name is " + book);  // stack empty [ null ]
    }
}

//  *****************************************************************
//  First In Last Out;  Stack is :

// [1]
// [2]
// [3]