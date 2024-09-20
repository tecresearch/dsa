package ds.util.algorithm.linkedlists;

import java.util.Scanner;

public class SC_Runner {

    public static void main(String[] args) {
        // SinglyLinkedList
    	SinglyCircularLinkedList scll = new SinglyCircularLinkedList();
        SinglyCircularNode head = scll.createLinkedList();  // Create linked list using custom SinglyNode
        // LinkedList<Integer> ll = scll.createLinkedList(); // Alternative: LinkedList<Integer>
        
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Press 0 for insert at begin of singly circular linked list ");
            System.out.println("Press 1 for insert at end of singly circular  linked list ");
            System.out.println("Press 2 for insert at position of singly circular  linked list ");
            System.out.println("Press 3 for delete from begin of singly circular linked list ");
            System.out.println("Press 4 for delete from end of singly circular linked list ");
            System.out.println("Press 5 for delete from position of singly circular linked list ");
            System.out.println("Press 6 for traverse the singly circular linked list ");
            System.out.println("Press 7 for exit() \n");
            int option = sc.nextInt();
            int element, index;
            switch (option) {
                case 0:
                    System.out.println("Enter the element to add at begin:");
                    element = sc.nextInt();
                    head = scll.insertAtBegin(head,element);  // Using custom SinglyNode
                    // ll = scll.insertAtBegin(ll, element); // Alternative: LinkedList<Integer>
                    System.out.println(element + " added successfully");
                    break;
                case 1:
                    System.out.println("Enter the element to add at end:");
                    element = sc.nextInt();
                    head = scll.insertAtEnd(head,element);  // Using custom SinglyNode
                    // ll = scll.insertAtEnd(ll, element); // Alternative: LinkedList<Integer>
                    System.out.println(element + " added successfully");
                    break;
                case 2:
                    System.out.println("Enter element to add at position:");
                    element = sc.nextInt();
                    System.out.println("Enter position:");
                    index = sc.nextInt();
                    head = scll.insertAtPosition(head, element, index);  // Using custom SinglyNode
                    // ll = scll.insertAtPosition(ll, element, index); // Alternative: LinkedList<Integer>
                    System.out.println(element + " added successfully");
                    break;
                case 3:
                    head = scll.deleteFromBegin(head);  // Using custom SinglyNode
                    // ll = scll.deleteFromBegin(ll); // Alternative: LinkedList<Integer>
                    System.out.println("Deleted element from the beginning successfully");
                    break;
                case 4:
                    head = scll.deleteFromEnd(head);  // Using custom SinglyNode
                    // ll = scll.deleteFromEnd(ll); // Alternative: LinkedList<Integer>
                    System.out.println("Deleted element from the end successfully");
                    break;
                case 5:
                    System.out.println("Enter position to delete:");
                    index = sc.nextInt();
                    head = scll.deleteFromPosition(head, index);  // Using custom SinglyNode
                    // ll = scll.deleteFromPosition(ll, index); // Alternative: LinkedList<Integer>
                    System.out.println("Deleted element at position " + index + " successfully");
                    break;
                case 6:
                    boolean status=scll.traverseLinkedList(head);  // Using custom SinglyNode
                    System.out.println(status);
                    // System.out.println(ll); // Alternative: LinkedList<Integer>
                    break;
                case 7:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid input, try again...");
            }
        } while (true);
    }
}
