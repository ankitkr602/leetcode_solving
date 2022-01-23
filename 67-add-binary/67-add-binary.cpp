class Solution {
public:
    string addBinary(string a, string b) {

   string sum="";
        int s=0;
        int i=a.length()-1, j=b.length()-1;
        while(i>=0 || j>=0 || s==1)
        {
            s+=((i>=0)? a[i] -'0': 0);
            s+=((j>=0)? b[j] -'0': 0);
            
            sum=(char) (s%2 + '0')+sum;
            
            s=s>>1;
            i--;
            j--;
            
        }
        return sum;
}
};