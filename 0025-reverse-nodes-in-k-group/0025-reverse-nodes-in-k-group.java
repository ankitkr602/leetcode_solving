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
    public ListNode reverse(ListNode head){
        ListNode curr = head, prev = null, next = null;
        while(curr!=null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr= next;
        }
        return prev;
    }

    private ListNode getkthNode(ListNode head, int k){
        k--;
        while(head!=null && k>0){
            head = head.next;
            k--;
        }
        return head;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head, prevNode = null, nextNode =null;
        while(temp!=null){
            ListNode kthNode = getkthNode(temp, k);
            if(kthNode == null){
                if(prevNode!=null){
                    prevNode.next = temp;
                }
                    break;
                }
                nextNode = kthNode.next;
                kthNode.next= null;
                reverse(temp);
                if(temp == head){
                    head = kthNode;
                }
                else{
                    prevNode.next = kthNode;
                }
                prevNode = temp;
                temp = nextNode;
            }

            return head;
        }
    
}