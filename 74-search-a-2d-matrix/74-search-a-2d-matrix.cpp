class Solution {
public:
    bool searchMatrix(vector<vector<int>>& matrix, int target) {
        for(int i =0;i<matrix.size();i++)
        {
           if(matrix[i][0]<=target && matrix[i][matrix[i].size()-1]>=target)
           {
               int start=0,end=matrix[i].size(),mid;
               while(start<=end)
                {
                    mid=(start+end)/2;
                    if(matrix[i][mid]<target){
                        start=mid+1;
                        }   
                    else if(matrix[i][mid]>target){
                    end=mid-1;
                    } 
                    else if(matrix[i][mid]==target){
                        return true;
                    } 
               }
               
           }
        }
        return false;
    }
};