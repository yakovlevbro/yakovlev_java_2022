// Merge Two Sorted Lists

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
       if (list1 == null){
            return list2;
       }else if(list2 == null){
           return list1;
       }
       
        ListNode head;
        ListNode nextList1;
        ListNode nextList2;

        ListNode currNode;

        if (list1.val <= list2.val) {
            head = new ListNode(list1.val);
            nextList1 = list1.next;
            nextList2 = list2;
        } else {
            head = new ListNode(list2.val);
            nextList1 = list1;
            nextList2 = list2.next;
        }

        currNode = head;

        while (nextList1 != null || nextList2 != null) {

           if (nextList1 == null) {
                currNode.next = nextList2;
                break;
            } else if (nextList2 == null) {
                currNode.next = nextList1;
                break;
            }

            ListNode newList;

            if (nextList1.val <= nextList2.val) {
                newList = new ListNode(nextList1.val);
                nextList1 = nextList1.next;
            } else {
                newList = new ListNode(nextList2.val);
                nextList2 = nextList2.next;
            }

            currNode.next = newList;
            currNode = newList;
        }

        return head;
    }
}
