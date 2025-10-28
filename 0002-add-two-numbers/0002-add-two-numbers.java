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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1, null);
        ListNode result = head;
        int carry = 0;
        int sum =0;
        while(l1!=null || l2!=null || carry!=0){
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;
            sum = x + y + carry;
            int digit = sum%10;
            sum = sum/10;
            carry = sum%10;
            ListNode temp = new ListNode(digit, null);
            result.next =temp;
            result = result.next;
            if(l1 != null)
            l1 = l1.next;
            if(l2 != null)
            l2 = l2.next;
        }
        
        return head.next;
    }
}