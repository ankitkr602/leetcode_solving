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
        i--;
         root->right=helper(in,post,m+1,end,i);
       // cout<<m<<endl;
        root->left=helper(in,post,s,m-1,i);
       
        return root;
        
         }
    
    TreeNode* buildTree(vector<int>& inorder, vector<int>& postorder) {
       
        int size=inorder.size()-1;
        return helper(inorder,postorder,0,size,size);
    }

};