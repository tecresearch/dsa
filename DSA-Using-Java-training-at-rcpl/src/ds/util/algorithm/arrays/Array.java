package ds.util.algorithm.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Array implements ArrayOperations {

    @Override
    public ArrayList<Integer> createArrayList() {
        return new ArrayList<>();  // Initialize and return an empty ArrayList
    }

    @Override
    public ArrayList<Integer> insertAtBegin(ArrayList<Integer> arr, int element) {
        Integer[] arr1 = arr.toArray(new Integer[0]);
        Integer[] newArr = Arrays.copyOf(arr1, arr1.length + 1);
        for (int i = newArr.length - 1; i > 0; i--) {
            newArr[i] = newArr[i - 1];
        }
        newArr[0] = element;
        arr = new ArrayList<>(Arrays.asList(newArr));
        return arr;
    }

    @Override
    public ArrayList<Integer> insertAtEnd(ArrayList<Integer> arr, int element) {
        Integer[] arr1 = arr.toArray(new Integer[0]);
        Integer[] newArr = Arrays.copyOf(arr1, arr1.length + 1);
        newArr[newArr.length - 1] = element;
        arr = new ArrayList<>(Arrays.asList(newArr));
        return arr;
    }

    @Override
    public ArrayList<Integer> insertAtPosition(ArrayList<Integer> arr, int element, int index) {
        if (arr.isEmpty()) {
            System.out.println("Empty array");
        } else {
            Integer[] arr1 = arr.toArray(new Integer[0]);
            Integer[] newArr = Arrays.copyOf(arr1, arr1.length + 1);

            if (index >= 1 && index <= newArr.length) {
                for (int i = newArr.length - 1; i > index - 1; i--) {
                    newArr[i] = newArr[i - 1];
                }
                newArr[index - 1] = element;
                arr = new ArrayList<>(Arrays.asList(newArr));
            } else {
                System.out.println("Invalid index");
            }
        }
        return arr;
    }

    @Override
    public ArrayList<Integer> deleteFromBegin(ArrayList<Integer> arr) {
        Integer[] arr1 = arr.toArray(new Integer[0]);
        if (arr.isEmpty()) {
            System.out.println("No value to be deleted.");
        } else {
            for (int i = 1; i < arr1.length; i++) {
                arr1[i - 1] = arr1[i];
            }
            Integer[] newArr = Arrays.copyOf(arr1, arr1.length - 1);
            arr = new ArrayList<>(Arrays.asList(newArr));
        }
        return arr;
    }

    @Override
    public ArrayList<Integer> deleteFromEnd(ArrayList<Integer> arr) {
        Integer[] arr1 = arr.toArray(new Integer[0]);
        if (arr.isEmpty()) {
            System.out.println("No value to be deleted.");
        } else {
            Integer[] newArr = Arrays.copyOf(arr1, arr1.length - 1);
            arr = new ArrayList<>(Arrays.asList(newArr));
        }
        return arr;
    }

    @Override
    public ArrayList<Integer> deleteFromPosition(ArrayList<Integer> arr, int index) {
        Integer[] arr1 = arr.toArray(new Integer[0]);
        if (arr.isEmpty()) {
            System.out.println("No value to be deleted.");
        } else {
            if (index >= 1 && index <= arr1.length) {
                for (int i = index - 1; i < arr1.length - 1; i++) {
                    arr1[i] = arr1[i + 1];
                }
                Integer[] newArr = Arrays.copyOf(arr1, arr1.length - 1);
                arr = new ArrayList<>(Arrays.asList(newArr));
            } else {
                System.out.println("Invalid index");
            }
        }
        return arr;
    }

    @Override
    public boolean traverseArray(ArrayList<Integer> arr) {
        if (arr.isEmpty()) {
            System.out.println("The array is empty.");
            System.out.println("Size of array: " + arr.size());
            return false;
        } else {
            System.out.println("Size of array: " + arr.size());
            for (Integer element : arr) {
                System.out.print(element + " ");
            }
            System.out.println();
            return true;
        }
    }

    @Override
    public boolean linearSearch(ArrayList<Integer> arr, int element) {
        int count = 0;
        if (arr.isEmpty()) {
            System.out.println("Empty array");
        } else {
            for (Integer value : arr) {
                if (value == element) {
                    count++;
                }
            }
        }
        if (count > 0) {
            System.out.println(element + " found " + count + " times");
            return true;
        }
        return false;
    }

    @Override
    public boolean binarySearch(ArrayList<Integer> arr, int element) {
        int low = 0;
        int high = arr.size() - 1;
        Integer[] arr1 = arr.toArray(new Integer[0]);
        Arrays.sort(arr1);
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr1[mid] == element) {
                return true;
            } else if (arr1[mid] > element) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }

    @Override
    public ArrayList<Integer> bubbleSort(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size() - i - 1; j++) {
                if (arr.get(j) > arr.get(j + 1)) {
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
            }
        }
        return arr;
    }

	@Override
	public ArrayList<Integer> selectionSort(ArrayList<Integer> arr) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<arr.size(); i++) {
			//Assuming sorted index
			int minIndex=i;
			
			for(int j=i+1; j<arr.size(); j++) {
				//finding the minimum element in the unsorted array
				if(arr.get(minIndex)>arr.get(j)) {
					minIndex=j;
				}
			}
			//check swapping needed 
			if(minIndex!=i) {
				int temp=arr.get(minIndex);
				arr.set(minIndex, arr.get(i));
				arr.set(i, temp);
			}
			
			
		}
		return arr;
	}

	@Override
	public ArrayList<Integer> insertionSort(ArrayList<Integer> arr) {
		
		return arr;
	}
}
