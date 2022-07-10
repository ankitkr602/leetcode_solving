class Solution {
public:
    double myPow(double x, int n) {
        if(n==0)
            return 1;
        if(n==1)
            return x;
         if(n==-1)
            return 1/x;
        double ans=myPow(x,n/2);
        if(n%2==0)
            return ans*ans;
        else if(n>0 && n%2!=0)
            return x*ans*ans;
        else
            return (1/x)*(ans*ans);
    }
};