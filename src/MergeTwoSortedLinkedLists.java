//Problem

//You are given the heads of two sorted linked lists list1 and list2.
//
//        Merge the two lists in a one sorted list. The list should be made by splicing together the nodes of the first two lists.
//
//        Return the head of the merged linked list.
//        Input: list1 = [1,2,4], list2 = [1,3,4]
//        Output: [1,1,2,3,4,4]
//
//Constraints:
//
//        The number of nodes in both lists is in the range [0, 50].
//        -100 <= Node.val <= 100
//        Both list1 and list2 are sorted in non-decreasing order.

import java.util.Iterator;
import java.util.LinkedList;

public class MergeTwoSortedLinkedLists {

    public static void main(String[] args) {
        // Input: list1 = [1,2,4], list2 = [1,3,4]
        ListNode list1node1 = new ListNode(1); // linked list 1
        ListNode list1node2 = new ListNode(1);
        ListNode list1node3 = new ListNode(4);
        list1node1.next = list1node2;
        list1node2.next = list1node3;

        ListNode list2node1 = new ListNode(1); // linked list 2
        ListNode list2node2 = new ListNode(3);
        ListNode list2node3 = new ListNode(4);
        list2node1.next = list2node2;
        list2node2.next = list2node3;

        mergeTwoSortedLinkedLists(list1node1, list2node1); // iterate through linked list returned here


    }
    public static ListNode mergeTwoSortedLinkedLists(ListNode l1, ListNode l2) {
        ListNode headNode = new ListNode(0);
        ListNode tailOfNewList = headNode, pointer1 = l1, pointer2 = l2;

        while(pointer1 != null && pointer2 != null){
            tailOfNewList.next = new ListNode(Math.min(pointer1.val, pointer2.val)); // Math.min returns the smaller number of two long numbers
            tailOfNewList = tailOfNewList.next;

            if(pointer1.val < pointer2.val) pointer1 = pointer1.next;
            else pointer2 = pointer2.next;
        }

        tailOfNewList.next = pointer1 == null ? pointer2 : pointer1;

         return headNode.next;
    }

    public static class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
