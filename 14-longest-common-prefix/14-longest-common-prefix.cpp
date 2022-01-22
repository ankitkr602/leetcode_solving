class Solution {
public:
     int matchstr(string s1 ,string s2)
    {
        int ans =0;
        int n = min(s1.size(),s2.size());
        for(int i=0 ;i< n; i++)
        {
            if(s1[i]==s2[i])
                ans++;
            else
                break;
        }
        return ans;      
    }
    string longestCommonPrefix(vector<string>& strs) {
        string ans;
        int n =strs.size();
        if(n==0)
            return ans;
        vector<int> dp(n);
        
        dp[0]=strs[0].size();
        for(int i=1; i<n;i++)
        {
            dp[i]=matchstr(strs[i-1],strs[i]);
            if(dp[i]==0)
                return ans;
        }
        
        int m = *min_element(dp.begin(),dp.end());
        
        for(int i=0 ;i<m;i++)
            ans.push_back(strs[0][i]);
        
        return ans;
    
        
    }
};