class Solution {
public:
    void setZeroes(vector<vector<int>>& matrix) {
        // int n=matrix[0].size();
        // int m=matrix.size();
        // int *row=new int[n];
        // int *col=new int[m];
        bool row=false;
        bool col=false;
        for(int i=0;i<matrix[0].size();i++)
            if(matrix[0][i]==0)
                row=true;
        for(int i=0;i<matrix.size();i++)
            if(matrix[i][0]==0)
                col=true;
        for(int i=1;i<matrix.size();i++)
        {
            for(int j=1;j<matrix[i].size();j++)
            {
                if(matrix[i][j]==0)
                {
                    matrix[0][j]=0;
                    matrix[i][0]=0;
                }
            }
        }
        for(int i=1;i<matrix[0].size();i++)
        {
            if(matrix[0][i]==0){
                for(int j=1;j<matrix.size();j++)
                  matrix[j][i]=0;
            }
        }
         for(int i=1;i<matrix.size();i++)
        {
            if(matrix[i][0]==0){
                for(int j=1;j<matrix[i].size();j++)
                    matrix[i][j]=0;
            }
        }
        //cout<<row<<col;
        if(row&&col)
        {
            for(int i=0;i<matrix[0].size();i++)
                matrix[0][i]=0;
            for(int i=0;i<matrix.size();i++)
                matrix[i][0]=0;
        }
        else if(row)
        {
             for(int i=0;i<matrix[0].size();i++)
                matrix[0][i]=0;
        }
        else if(col){
            for(int i=0;i<matrix.size();i++)
                matrix[i][0]=0;
        }
        

    }
};