package ds.util.algorithm.linkedlists;

public interface SinglyCircularLinkedListOperations {

    // Create a new linked list using custom SinglyCircularNode type
    SinglyCircularNode createLinkedList();

    // Insert an element at the beginning of the linked list using custom SinglyCircularNode type
    SinglyCircularNode insertAtBegin(SinglyCircularNode head, int element);

    // Insert an element at the end of the linked list using custom SinglyCircularNode type
    SinglyCircularNode insertAtEnd(SinglyCircularNode head, int element);

    // Insert an element at a specific position in the linked list using custom SinglyCircularNode type
    SinglyCircularNode insertAtPosition(SinglyCircularNode head, int element, int position);

    // Delete an element from the beginning of the linked list using custom SinglyCircularNode type
    SinglyCircularNode deleteFromBegin(SinglyCircularNode head);

    // Delete an element from the end of the linked list using custom SinglyCircularNode type
    SinglyCircularNode deleteFromEnd(SinglyCircularNode head);

    // Delete an element from a specific position in the linked list using custom SinglyCircularNode type
    SinglyCircularNode deleteFromPosition(SinglyCircularNode head, int position);

    // Traverse the linked list using custom SinglyCircularNode type
    boolean traverseLinkedList(SinglyCircularNode head);
}
