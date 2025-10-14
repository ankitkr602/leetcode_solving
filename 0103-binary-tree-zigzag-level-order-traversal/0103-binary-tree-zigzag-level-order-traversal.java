/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        int lefttoRight =0;
        if(root!=null){
        q.add(root);

        }
        while(!q.isEmpty()){
            List<Integer> list = new ArrayList<>();
            int size = q.size();
        for(int i =1; i<= size; i++){
           TreeNode temp =  q.poll();
           if(temp.left !=null)
           q.add(temp.left);
           if(temp.right !=null)
           q.add(temp.right);
           list.add(temp.val);
        }
        if(lefttoRight == 1){
        Collections.reverse(list);
        lefttoRight = 0;
        }
       else{
        lefttoRight =1;
       }
        result.add(list);

        }
        return result;
    }
}