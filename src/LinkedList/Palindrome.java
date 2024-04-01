package LinkedList;

import java.util.List;

public class Palindrome {


    public static void main(String[] args) {
        ListNode list = new ListNode(1);
        list.next = new ListNode(2);
        list.next.next = new ListNode(3);
        list.next.next.next = new ListNode(2);
        list.next.next.next.next = new ListNode(1);




        ListNode rev = reverse(list);
        printNodes(rev);
        System.out.println("");

        System.out.println(palindrome(list,rev));


    }

    public static void printNodes(ListNode head){
        ListNode current = head;
        while (current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
    }



    public static boolean palindrome(ListNode head, ListNode rev){
        ListNode current = head;

        ListNode rev1 = rev;
        while(rev1 != null && current !=null){
            if(rev1.val != current.val){
                return false;
            }
            rev1 = rev1.next;
            current = current.next;
        }
        return true;
    }

    public static ListNode reverse(ListNode head){
//        ListNode resHead = new ListNode(0);
//        ListNode res = resHead;
        ListNode current = head;
        ListNode prev = null;
        ListNode nextNode =null;


        while(current != null){
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current =nextNode;
        }
        return prev;
    }
}
