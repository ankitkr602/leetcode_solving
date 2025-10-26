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
        int len = 0;
        ListNode temp = new ListNode(0);
        temp.next = head;
        ListNode front = temp;
        while(front != null){
            front = front.next;
            len++;
        }
        ListNode back = temp;
        int removefromback = len - n +1;
        while(removefromback-1 > 1){
            back = back.next;
            removefromback--;
        }
        back.next = back.next.next;
        return temp.next;
    }
}