// To provide a complete overview of **Core Java**, I'll break down the key concepts and features. Core Java refers to the foundational aspects of Java programming, including the language's syntax, object-oriented principles, and core libraries. Below is a summary of **Core Java** concepts, along with code examples to illustrate each part.

// ### 1. **Basic Syntax & Structure**
// Java programs are made up of classes and methods. The entry point for every Java application is the `main` method.

// ```java

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

// ```

// ### 2. **Data Types and Variables**
// Java supports several data types, including primitive types (like `int`, `char`, `boolean`) and reference types (like arrays, classes).

// #### Primitive Data Types:
// ```java

int age = 25;        // Integer
double height = 5.9; // Double precision floating point
boolean isAdult = true; // Boolean
char grade = 'A';    // Character
// ```

// #### Reference Data Types:
// ```java
String name = "John"; // String
int[] numbers = {1, 2, 3}; // Array
// ```

// ### 3. **Control Flow (Conditionals and Loops)**
// Java provides several control flow statements like **if-else**, **switch-case**, **for**, **while**, and **do-while**.

// #### If-Else:
// ```java
if (age > 18) {
    System.out.println("Adult");
} else {
    System.out.println("Not an adult");
}
// ```

// #### Switch-Case:
// ```java
switch (grade) {
    case 'A':
        System.out.println("Excellent");
        break;
    case 'B':
        System.out.println("Good");
        break;
    default:
        System.out.println("Invalid grade");
}
// ```

// #### Loops:
// - **For Loop**: Used when the number of iterations is known.
// ```java
for (int i = 0; i < 5; i++) {
    System.out.println(i);
}
// ```

// - **While Loop**: Runs as long as the condition is true.
// ```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    i++;
}
// ```

// - **Do-While Loop**: Executes the block of code once before checking the condition.
// ```java
int i = 0;
do {
    System.out.println(i);
    i++;
} while (i < 5);
// ```

// ### 4. **Arrays**
// An array is a collection of similar data types stored in a contiguous memory location.

// ```java
int[] numbers = {1, 2, 3, 4, 5};
for (int i = 0; i < numbers.length; i++) {
    System.out.println(numbers[i]);
}
// ```

// ### 5. **Methods (Functions)**
// Methods are blocks of code that perform a specific task. Methods can take arguments and return values.

// ```java
public class MethodsExample {
    public static void main(String[] args) {
        greetUser("John");
        int result = addNumbers(10, 20);
        System.out.println("Sum: " + result);
    }

    public static void greetUser(String name) {
        System.out.println("Hello, " + name);
    }

    public static int addNumbers(int a, int b) {
        return a + b;
    }
}
// ```

// ### 6. **Object-Oriented Programming (OOP) Concepts**
// Java is an object-oriented programming language, which means everything is represented as an object.

// #### 1. **Class & Object:**
// A **class** is a blueprint for creating objects, and an **object** is an instance of a class.

// ```java
class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hi, I am " + name + " and I am " + age + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 25);
        person1.introduce();
    }
}
// ```

// #### 2. **Encapsulation** (Access Modifiers):
// Encapsulation refers to hiding the internal state of an object and requiring all interaction to be performed through methods.

// ```java
class Person {
    private String name;
    private int age;

    // Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}
// ```

// #### 3. **Inheritance**:
// Inheritance allows one class (child) to inherit fields and methods from another class (parent).

// ```java
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound(); // Output: Animal makes a sound
        
        Dog dog = new Dog();
        dog.sound(); // Output: Dog barks
    }
}
// ```

// #### 4. **Polymorphism**:
// Polymorphism allows objects of different classes to be treated as objects of a common super class.

// ```java
class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting
        animal.sound(); // Output: Dog barks
    }
}
// ```

// #### 5. **Abstraction**:
// Abstraction is the concept of hiding the complex implementation details and showing only the essential features.

// ```java
abstract class Animal {
    abstract void sound();
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound(); // Output: Dog barks
    }
}
// ```

// ### 7. **Interfaces**
// An interface is a reference type in Java, it is similar to a class, but it can only contain constants, method signatures, default methods, static methods, and nested types.

// ```java
interface Animal {
    void sound();
}

class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.sound(); // Output: Dog barks
    }
}
// ```

// ### 8. **Exception Handling**
// Java provides a powerful mechanism for handling errors, known as exception handling.

// ```java
public class Main {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // This will throw ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("This block is always executed.");
        }
    }
}
// ```

// ### 9. **Collections Framework**
// The Collections Framework provides classes and interfaces to store and manipulate data in various ways.

// - **List**: An ordered collection (like an ArrayList).
// - **Set**: A collection that doesn’t allow duplicates (like HashSet).
// - **Map**: A collection that stores key-value pairs (like HashMap).

// ```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Orange");

        for (String fruit : list) {
            System.out.println(fruit);
        }
    }
}
// ```

// ### 10. **Multithreading**
// Java supports multithreading, allowing multiple threads to run concurrently, improving performance in CPU-intensive tasks.

// ```java
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();
    }
}
// ```

// ---

// ### Conclusion
// Core Java provides a vast set of tools to create efficient, scalable, and maintainable software. The above sections cover the key concepts such as syntax, OOP principles, control flow, exception handling, and concurrency. As you progress, you can delve deeper into more advanced topics like Java I/O, networking, and JDBC (database connectivity).