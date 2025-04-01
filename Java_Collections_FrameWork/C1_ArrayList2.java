package Java_Collections_Framework;
 import java.util.ArrayList;

public class C1_ArrayList2 {
    public static void main(String[] args) {
        ArrayList<String> study = new ArrayList<>();
//  step1
        study.add("Priyanshu");
        study.add("Hello");
        System.out.println(study);

//  step2
        study.add("hi");
        System.out.println(study);

// step3 * main
        ArrayList<Integer> student = new ArrayList<>();
        student.add(1);
        student.add(2);
        student.add(3);
        student.add(4);
        student.add(5);
        student.add(6);
        student.add(7);
        student.add(8);

        System.out.println(student);

//part 1
        for (int i = 0; i < student.size(); i++) {
            System.out.println("Student id : " + student.get(i));
        }
//part 2
        for(Integer element : student){
            System.out.println("Student Roll no : " + element);
        }

        student.set(2, 10); // set update index 1 , element (20 value)
        System.out.println(student);

        System.out.println(student.contains(50)); // check element

        student.remove(1);  // This will remove the element at index 1 i.e 20.
        System.out.println(student);

        student.remove(Integer.valueOf(30)); // This will remove 30 from the list
        System.out.println(student);

        student.clear(); //This will remove all the elements from the list.
        System.out.println(student);
    }
}