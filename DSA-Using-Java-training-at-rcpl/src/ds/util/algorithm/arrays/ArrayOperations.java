package ds.util.algorithm.arrays;

import java.util.ArrayList;

public interface ArrayOperations {

    // Method to create and return an empty ArrayList
    ArrayList<Integer> createArrayList();

    // Method to insert an element at the beginning of the ArrayList
    ArrayList<Integer> insertAtBegin(ArrayList<Integer> arr, int element);

    // Method to insert an element at the end of the ArrayList
    ArrayList<Integer> insertAtEnd(ArrayList<Integer> arr, int element);

    // Method to insert an element at a specified position in the ArrayList
    ArrayList<Integer> insertAtPosition(ArrayList<Integer> arr, int element, int index);

    // Method to delete an element from the beginning of the ArrayList
    ArrayList<Integer> deleteFromBegin(ArrayList<Integer> arr);

    // Method to delete an element from the end of the ArrayList
    ArrayList<Integer> deleteFromEnd(ArrayList<Integer> arr);

    // Method to delete an element from a specified position in the ArrayList
    ArrayList<Integer> deleteFromPosition(ArrayList<Integer> arr, int index);

    // Method to traverse the ArrayList and print its elements
    boolean traverseArray(ArrayList<Integer> arr);

    // Method to perform a linear search in the ArrayList
    boolean linearSearch(ArrayList<Integer> arr, int element);

    // Method to perform a binary search in the ArrayList
    boolean binarySearch(ArrayList<Integer> arr, int element);

    // Method to perform bubble sort on the ArrayList
    ArrayList<Integer> bubbleSort(ArrayList<Integer> arr);
    
 // Method to perform selection sort on the ArrayList
    ArrayList<Integer> selectionSort(ArrayList<Integer> arr);
    
 // Method to perform insertion sort on the ArrayList
    ArrayList<Integer> insertionSort(ArrayList<Integer> arr);
}
