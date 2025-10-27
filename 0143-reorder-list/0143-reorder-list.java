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
    public void reorderList(ListNode head) {
          ListNode slow = head, fast = head;
          while(fast != null && fast.next !=null)
          {
            slow = slow.next;
            fast = fast.next.next;
          }

          ListNode prev = null, next = null, curr = slow;
          while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
          }

          ListNode temp = head;
          while(prev.next != null){
            ListNode t  = temp.next;
            temp.next = prev;
            temp = t;
            
            ListNode p = prev.next;
            prev.next = temp;
            prev = p;
          }
         
    }
}