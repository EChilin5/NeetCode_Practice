package LinkedList;

import java.util.List;

public class SumList {

    public static void main(String[] args) {
        ListNode list = new ListNode(7);
        list.next = new ListNode(1);
        list.next.next = new ListNode(6);

        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(9);
        list2.next.next = new ListNode(2);



        System.out.println("\nList: ");
        printNodes(list);
        System.out.println();
        printNodes(list2);

        System.out.println("\nReturn new list: ");
        printNodes(sum(list, list2));

    }

    public static void printNodes(ListNode head){
        ListNode current = head;
        while (current != null){
            System.out.print(current.val + " ");
            current = current.next;
        }
    }

    private static ListNode sum(ListNode list, ListNode list2) {
        ListNode sumHead = new ListNode(0);
        ListNode sum = sumHead;
        ListNode vA = list;
        ListNode vB = list2;

        int carry = 0;

        while(vA != null || vB != null){
            int tempSum = vA.val + vB.val + carry;
            System.out.println(vA.val + " <---a  b--->" + vB.val + "==" + tempSum);

            if((tempSum - 10) > 0){
                carry = 1;
                sum.next = new ListNode(tempSum-10);
                sum = sum.next;
            }else{
                carry = 0;
                sum.next = new ListNode(tempSum);
                sum = sum.next;
            }
            vA = vA.next;
            vB = vB.next;
        }
        return sumHead.next;
    }

}
