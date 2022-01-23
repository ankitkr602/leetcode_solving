class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
        for(int i=0;i<matrix.size();i++)
        {
            for(int j=0;j<i;j++)
            {
                swap(matrix[i][j],matrix[j][i]);
            }
        }
        int len= matrix.size()/2;
        for(int i=0;i<matrix.size();i++)
        {
            for(int j=0;j<len;j++)
            {
                swap(matrix[i][j],matrix[i][matrix.size()-1-j]);
            }
        }
    }
};