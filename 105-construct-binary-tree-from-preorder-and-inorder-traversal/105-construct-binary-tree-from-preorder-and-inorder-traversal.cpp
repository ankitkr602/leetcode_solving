/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
     TreeNode* helper(vector<int>& in,vector<int>& post,int s,int end,int &i)
    {
//static int i=0;
        if(s>end){
            return NULL;
          }
        TreeNode* root=new TreeNode(post[i]);
        
        int m=0;
        for(int j=s;j<=end;j++)
        {
            if(post[i]==in[j])
            { m=j;
    
            break;
            }
        }
        i++;
         root->left=helper(in,post,s,m-1,i);
         root->right=helper(in,post,m+1,end,i);
       // cout<<m<<endl;
        
       
        return root;
        
         }
    TreeNode* buildTree(vector<int>& preorder, vector<int>& inorder) {
        int i=0;
        return helper(inorder,preorder,0,inorder.size()-1,i);
        
    }
};