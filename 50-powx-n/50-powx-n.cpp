class Solution {
public:
    double myPow(double x, int n) {
        double ans=1;
        long long nn;
        if(n<0)
        nn=-1LL*n;
        else nn=n;
        while(nn>0)
        {
            if(nn%2)
            {
                ans=ans*x;
                nn=nn-1;
            }
            else
            {
                x=x*x;
                nn=nn/2;
            }
        }
        if(n<0)
        ans=double(1)/ans;
        return ans;
    }
};