package ds.util.algorithm.arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
	
	 public static void main(String[] args) {
			Array ans=new Array();
			ArrayList<Integer> arr= ans.createArrayList();
			Scanner sc=new Scanner(System.in);
//			char ch;
			do {
				
				System.out.println("Press 0 for insert at begin of array ");
				System.out.println("Press 1 for insert at end of array ");
				System.out.println("Press 2 for insert at possition of array ");
				System.out.println("Press 3 for delete from begin of array ");
				System.out.println("Press 4 for delete from end of array ");
				System.out.println("Press 5 for delete from possition of array ");
				System.out.println("Press 6 for traverse the  array ");
				System.out.println("Press 7 for linear search the  array ");
				System.out.println("Press 8 for binary search the  array ");
				System.out.println("Press 9 for bouble sort the  array ");
				System.out.println("Press 10 for selection sort the  array ");
				System.out.println("Press 11 for exit() \n");
				int option=sc.nextInt();
				int element,index;
				switch(option) {
				case 0:
					System.out.println("Enter the element to add at begin:");
					 element=sc.nextInt();
					arr=ans.insertAtBegin(arr,element);
					System.out.println(""+element+" added successfully");
					break;
				case 1:
					System.out.println("Enter the element to add at end :");
					 element=sc.nextInt();
					arr=ans.insertAtEnd(arr,element);
					System.out.println(""+element+" added successfully");
					break;
				case 2:
					
					System.out.println("Enter element to add at possition: ");
					element=sc.nextInt();
					System.out.println("Enter the position");
					index=sc.nextInt();
					arr = ans.insertAtPosition(arr,element,index);
					System.out.println(""+element+" added successfully");
					break;
				case 3:
					
					arr=ans.deleteFromBegin(arr);
					System.out.println("value deleted successfully");
					break;
				case 4:
					
					arr=ans.deleteFromEnd(arr);
					System.out.println("value  deleted successfully");
					break;
				case 5:
					
					System.out.println("Enter possition  to delete : ");
					index=sc.nextInt();
				
					arr = ans.deleteFromPosition(arr,index);
					System.out.println(""+index+" value deleted successfully");
					break;
				case 6:
					boolean status = ans.traverseArray(arr);
					System.out.println(status);
					break;
				case 7:
					System.out.println("Enter element to search: ");
					element=sc.nextInt();
				
					boolean status1 = ans.linearSearch(arr, element);
					System.out.println(status1);
					break;
				case 8:
					System.out.println("Enter element to search: ");
					element=sc.nextInt();
					
					boolean status11 = ans.binarySearch(arr, element);
					System.out.println(status11);
					break;
				case 9:
					
					arr=ans.bubbleSort(arr);
					System.out.println("Sorted succeded");
					break;
				case 10:
					
					arr=ans.selectionSort(arr);
					System.out.println("Sorted succeded");
					break;
					
				case 11:
						return;
				default:
					System.out.println("Invalid input try again...");
					
				}
				
//				System.out.println("Press y/Y to continue...");
//				ch=sc.next().charAt(0);
			}while(true);
		}

}
