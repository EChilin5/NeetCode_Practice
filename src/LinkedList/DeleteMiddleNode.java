package LinkedList;

import java.util.List;


public class DeleteMiddleNode {
    public static void main(String[] args) {
        // Create a linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
//        head.next.next.next = new ListNode(4);
//        head.next.next.next.next = new ListNode(5);

        // Print the original linked list
        System.out.println("Original Linked List: ");
        printList(head);

        System.out.println("\nNew Linked List: ");
        printList(deleteMiddleNode(head));


    }


    // Helper method to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }


    public static ListNode deleteMiddleNode(ListNode middleNode) {
        if (middleNode == null || middleNode.next == null || middleNode.next.next == null) {
            return null; // Can't delete if node is null or last node
        }

        // Copy the value from the next node to the current node
        middleNode.val = middleNode.next.val;
        // Delete the next node by skipping it
        middleNode.next = middleNode.next.next;
        return middleNode;
    }
}
