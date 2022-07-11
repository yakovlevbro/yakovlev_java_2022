// Remove Nth Node From End of List


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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode nextNode = head;
        int size = 0;

        while (nextNode != null) {
            size++;
            nextNode = nextNode.next;
        }

        if (size == 1 && n == 1){
            return null;
        }
        
        nextNode = head;

        if (size == n){
            return head.next;
        }


        for (int i = 0; i < size - n ; i++) {
            if (i == size - n - 1) {
                nextNode.next = nextNode.next.next;
            }
            nextNode = nextNode.next;
        }

        return head;
    }
}
