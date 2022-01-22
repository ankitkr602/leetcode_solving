class Solution {
public:
    int reverse(int long x) {
       
        long long sum=0;
        if(x<0)
        {
            long long n1=abs(x);
        while(n1>0)
        {
            int d=n1%10;
          sum=sum*10+ d;
            n1=n1/10;
        }
            sum=-sum;
             
         
    }
        else{
            while(x>0)
        {
            long long d=x%10;
          sum=sum*10+ d;
            x=x/10;
        }
           
 }
         if(sum>=pow(2,31)||sum<=pow(-2,31))
            return 0;
      return sum;  
    }
};