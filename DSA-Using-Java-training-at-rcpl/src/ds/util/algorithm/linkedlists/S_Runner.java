package ds.util.algorithm.linkedlists;

import java.util.Scanner;

public class S_Runner {

    public static void main(String[] args) {
        // SinglyLinkedList
        SinglyLinkedList sll = new SinglyLinkedList();
        SinglyNode head = sll.createLinkedList();  // Create linked list using custom SinglyNode
        // LinkedList<Integer> ll = sll.createLinkedList(); // Alternative: LinkedList<Integer>
        
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Press 0 for insert at begin of singly linked list ");
            System.out.println("Press 1 for insert at end of singly linked list ");
            System.out.println("Press 2 for insert at position of singly linked list ");
            System.out.println("Press 3 for delete from begin of singly linked list ");
            System.out.println("Press 4 for delete from end of singly linked list ");
            System.out.println("Press 5 for delete from position of singly linked list ");
            System.out.println("Press 6 for traverse the singly linked list ");
            System.out.println("Press 7 for exit() \n");
            int option = sc.nextInt();
            int element, index;
            switch (option) {
                case 0:
                    System.out.println("Enter the element to add at begin:");
                    element = sc.nextInt();
                    head = sll.insertAtBegin(head,element);  // Using custom SinglyNode
                    // ll = sll.insertAtBegin(ll, element); // Alternative: LinkedList<Integer>
                    System.out.println(element + " added successfully");
                    break;
                case 1:
                    System.out.println("Enter the element to add at end:");
                    element = sc.nextInt();
                    head = sll.insertAtEnd(head,element);  // Using custom SinglyNode
                    // ll = sll.insertAtEnd(ll, element); // Alternative: LinkedList<Integer>
                    System.out.println(element + " added successfully");
                    break;
                case 2:
                    System.out.println("Enter element to add at position:");
                    element = sc.nextInt();
                    System.out.println("Enter position:");
                    index = sc.nextInt();
                    head = sll.insertAtPosition(head, element, index);  // Using custom SinglyNode
                    // ll = sll.insertAtPosition(ll, element, index); // Alternative: LinkedList<Integer>
                    System.out.println(element + " added successfully");
                    break;
                case 3:
                    head = sll.deleteFromBegin(head);  // Using custom SinglyNode
                    // ll = sll.deleteFromBegin(ll); // Alternative: LinkedList<Integer>
                    System.out.println("Deleted element from the beginning successfully");
                    break;
                case 4:
                    head = sll.deleteFromEnd(head);  // Using custom SinglyNode
                    // ll = sll.deleteFromEnd(ll); // Alternative: LinkedList<Integer>
                    System.out.println("Deleted element from the end successfully");
                    break;
                case 5:
                    System.out.println("Enter position to delete:");
                    index = sc.nextInt();
                    head = sll.deleteFromPosition(head, index);  // Using custom SinglyNode
                    // ll = sll.deleteFromPosition(ll, index); // Alternative: LinkedList<Integer>
                    System.out.println("Deleted element at position " + index + " successfully");
                    break;
                case 6:
                    sll.traverseLinkedList(head);  // Using custom SinglyNode
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
