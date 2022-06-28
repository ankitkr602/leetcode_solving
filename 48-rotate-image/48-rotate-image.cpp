class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        for(int i=0;i<matrix.size();i++)
        {
            for(int j=0;j<matrix[i].size()/2;j++)
            {
                swap(matrix[i][j],matrix[i][matrix.size()-1-j]);
            }
        }
         for(int i=0;i<matrix.size()-1;i++)
        {
            for(int j=0;j<matrix[i].size()-i-1;j++)
            {
                swap(matrix[i][j],matrix[matrix.size()-1-j][matrix.size()-1-i]);
            }
        }
    }
};