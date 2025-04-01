package Java_Collections_Framework;

import java.util.Arrays;

public class C5_ArrayClass {

    public static void main(String[] args) {

//        int[] number = {1,2,3,4,5}; // 0 1 2 3 , n-1
//        int index = Arrays.binarySearch(number, 1); // sort
//        System.out.println("index of element: " + index);

        int[] numbers ={1,4,3,6,5};
        Arrays.sort(numbers);

        Arrays.fill(numbers, 4);

        for(int i: numbers){
            System.out.print(i + " ");
        }
    }
}
