package ds.util.algorithm.linkedlists;

public interface SinglyLinkedListOperations {

    // Create a new linked list using custom SinglyNode type
    SinglyNode createLinkedList();

    // Insert an element at the beginning of the linked list using custom SinglyNode type
    SinglyNode insertAtBegin(SinglyNode head, int element);

    // Insert an element at the end of the linked list using custom SinglyNode type
    SinglyNode insertAtEnd(SinglyNode head, int element);

    // Insert an element at a specific position in the linked list using custom SinglyNode type
    SinglyNode insertAtPosition(SinglyNode head, int element, int position);

    // Delete an element from the beginning of the linked list using custom SinglyNode type
    SinglyNode deleteFromBegin(SinglyNode head);

    // Delete an element from the end of the linked list using custom SinglyNode type
    SinglyNode deleteFromEnd(SinglyNode head);

    // Delete an element from a specific position in the linked list using custom SinglyNode type
    SinglyNode deleteFromPosition(SinglyNode head, int position);

    // Traverse the linked list using custom SinglyNode type
    void traverseLinkedList(SinglyNode head);
}
