class Solution {
public:
    bool isPalindrome(int x) {
        long long d,sum=0;
        if(x>=0)
        {
            long long x1=x;
            while(x1!=0)
            {
             d=x1%10;
                sum=sum*10+d;
                x1=x1/10;
            }
            if(sum==x)
                return true;
        }
        return false;
            
    
        
        
    }
};