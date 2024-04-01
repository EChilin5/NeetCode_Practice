package LinkedList;

import java.util.LinkedList;
import java.util.List;


public class nthToLastNode {
    public static void main(String[] args) {
        // Create a linked list
        ListNode head = new ListNode(14);
        head.next = new ListNode(24);
        head.next.next = new ListNode(32);
        head.next.next.next = new ListNode(24);
        head.next.next.next.next = new ListNode(245);
        head.next.next.next.next.next = new ListNode(643);
        head.next.next.next.next.next.next = new ListNode(437);

        // Print the original linked list
        System.out.println("Original Linked List: ");
        printList(head);

        // Remove duplicates using HashSet
        ListNode rest = LastNode(head, 4);

        // Print the linked list after removing duplicates
        System.out.println("\nnth value ");
        //printList(head);
        System.out.print(rest.val);
    }

    public static void printList(ListNode head){
        ListNode current = head;
        while (current !=null){
            System.out.print(" " + current.val);
            current = current.next;
        }
    }

    public static ListNode LastNode(ListNode head, int k){
        ListNode current = head;
        ListNode sub = head;

        for(int i = 0; i < k; i++){
            current = current.next;
        }

        while(current != null){
            current = current.next;
            sub = sub.next;
        }
        return sub;

    }

}
