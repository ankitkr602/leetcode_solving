class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        int n=matrix[0].size();
        int m=matrix.size();
        int *row=new int[n];
        int *col=new int[m];
      //  vector<int>col;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(matrix[i][j]==0)
                {
                    col[i]=1;
                    row[j]=1;
                }
            }
        }
        for(int i=0;i<matrix[0].size();i++)
        {
            if(row[i]==1)
            {
                for(int j=0;j<m;j++)
                    matrix[j][i]=0;
            }
        }
        for(int i=0;i<m;i++)
        {
            if(col[i]==1)
            {
                for(int j=0;j<n;j++)
                    matrix[i][j]=0;
            }
        }
    }
};