class Solution {
public:
    string countAndSay(int n) {
        string s="1";
        char prev;
       
        for(int i=2;i<=n;i++)
        {
             int count=1;
        prev=s[0];
            string k="";
            for(int j=1;j<s.length();j++)
                {if(prev==s[j])
                    count++;
                 else{
                     k=k+to_string(count)+prev;
                     prev=s[j];
                     count=1;
                 }
                    
                }
            if(count>0)
               k=k+to_string(count)+prev;
            else
                k=k+to_string(1)+prev;
            s=k;
        }
        return s;
    }
};