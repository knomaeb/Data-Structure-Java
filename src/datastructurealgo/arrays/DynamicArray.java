package datastructurealgo.arrays;

import java.util.ArrayList;

public class DynamicArray {
    public static void main(String[] args) {
        // Creating a dynamic array
        ArrayList<Integer> dynamicArray = new ArrayList<>();

        // Adding elements
        dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);

        System.out.println("Dynamic Array: " + dynamicArray); // [10, 20, 30]

        // Removing an element
        dynamicArray.remove(1); // Removes the element at index 1 (20)
        System.out.println("After Removal: " + dynamicArray); // [10, 30]

        // Accessing elements
        System.out.println("Element at index 1: " + dynamicArray.get(1)); // 30

        // Size of the dynamic array
        System.out.println("Size: " + dynamicArray.size()); // 2
    }
}


