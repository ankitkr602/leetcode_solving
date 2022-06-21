class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        // int n=matrix[0].size();
        // int m=matrix.size();
        // int *row=new int[n];
        // int *col=new int[m];
        vector<int>row;
        vector<int>col;
        for(int i=0;i<matrix.size();i++)
        {
            for(int j=0;j<matrix[i].size();j++)
            {
                if(matrix[i][j]==0)
                {
                    col.push_back(i);
                    row.push_back(j);
                }
            }
        }
        for(int i=0;i<row.size();i++)
                for(int j=0;j<matrix.size();j++)
                    matrix[j][row[i]]=0;
        
        for(int i=0;i<col.size();i++)
                for(int j=0;j<matrix[col[i]].size();j++)
                    matrix[col[i]][j]=0;

    }
};