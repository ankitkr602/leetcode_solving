/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node head2 = head;
        HashMap<Node, Node> mp = new HashMap<>();
        Node dummy = new Node(-1);
        Node head1 = dummy;
        int i =0;
        while(head2!=null){
            Node temp = new Node(head2.val);
            mp.put(head2, temp);
            head1.next = temp;
            head1 = head1.next;
            head2 = head2.next;
           
        }
        head1 = dummy.next;
        head2 = head;
        while(head2!=null){
             head1.random = mp.get(head2.random);
            if(mp.containsKey(head2.random))
            System.out.println(head2.val);
            else 
            head1.random = null;
            head1 = head1.next;
            head2 = head2.next;
        }
        return dummy.next;
    }
}