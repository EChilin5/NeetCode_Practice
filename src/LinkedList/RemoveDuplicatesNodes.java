package LinkedList;

import java.util.HashSet;

class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }
}

public class RemoveDuplicatesNodes {
    public static void main(String[] args) {
        // Create a linked list
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(2);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next = new ListNode(5);

        // Print the original linked list
        System.out.println("Original Linked List: ");
        printList(head);

        // Remove duplicates using HashSet
        removeDuplicates(head);

        // Print the linked list after removing duplicates
        System.out.println("\nLinked List after removing duplicates: ");
        printList(head);
    }

    public static void printList(ListNode head){
        ListNode current = head;
        while(current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static void removeDuplicates(ListNode head){
        HashSet<Integer> set = new HashSet<>();
        ListNode prev = null;
        ListNode current = head;

        while(current != null){
            if(set.contains(current.val)){
                // prev
                prev.next = current.next;
            }else{
                set.add(current.val);
                prev = current;
            }
            current = current.next;
        }
    }

}
