package LinkedList;

import org.w3c.dom.Node;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDuplicates {


    public static void main(String[] args) {
        ListNode list = new ListNode(32);
        list.next = new ListNode(24);
        list.next.next = new ListNode(32);
        list.next.next.next = new ListNode(24);
        list.next.next.next.next = new ListNode(245);
        list.next.next.next.next.next = new ListNode(643);
        list.next.next.next.next.next.next = new ListNode(437);

        // Print the original linked list
        System.out.println("Original Linked List: " );
        printNodes(list);

        System.out.println("\nLinked List after removing duplicates: ");
        ListNode updated = Dups(list);
        printNodes(updated);

    }

    public static void printNodes(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print(current.val+" ");
            current = current.next;
        }
    }

    public static ListNode Dups(ListNode head) {
        if(head == null){
            return null;
        }
        HashSet<Integer> set = new HashSet<>();
        ListNode current = head;
        ListNode prev = null;

        while (current != null) {
            if (set.contains(current.val)) {
                prev.next = current.next;
            } else {
                set.add(current.val);
                prev = current;
            }
            current = current.next;
        }
        return head;
    }
}
