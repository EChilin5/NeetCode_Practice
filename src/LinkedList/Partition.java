package LinkedList;

import java.util.List;

public class Partition {
    public static void main(String[] args) {
        ListNode list =new ListNode(2);
        list.next = new ListNode(1);
        list.next.next = new ListNode(33);
        list.next.next.next = new ListNode(5);
        list.next.next.next.next = new ListNode(42);
        list.next.next.next.next.next = new ListNode(4);
        list.next.next.next.next.next.next = new ListNode(443);
        list.next.next.next.next.next.next.next = new ListNode(3);


        System.out.println("Orrginal List: ");
        printNodes(list);
        System.out.println("\nReturn new list: ");
        printNodes(partition(list,5));

    }

    public static void printNodes(ListNode head){
        ListNode current = head;
        while (current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    public static ListNode partition(ListNode head, int x){
        if (head == null) {
            return null;
        }

        ListNode leftHead = new ListNode(0);
        ListNode left = leftHead;
        ListNode rightHead = new ListNode(0);
        ListNode right = rightHead;

        ListNode current = head;

        while (current != null) {
            if (current.val < x) {
                left.next = current;
                left = left.next;
            } else {
                right.next = current;
                right = right.next;
            }
            current = current.next;
        }

        left.next = rightHead.next;
        right.next = null;

        return leftHead.next;
    }
}
