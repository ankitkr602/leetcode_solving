class Solution {
public:
    int longestValidParentheses(string s) {
     stack<int>st;
     vector<int>v;
     int k=0; 
         int max=0;
    int count=0;
if(s.length()>0){
	   
	    for(int i=0;i<s.length();i++)
	    {
	        if(s[i]=='(')
	        {
              v.push_back(1);
                st.push(k);
                k++;
                
            }
            else if(!st.empty()&& s[i]==')'){
                v[st.top()]=v[st.top()]-1;
                st.pop();
                
            }
            else{
                v.push_back(-1);
                k++;
            }
        }
   
    for(int j=0;j<v.size();j++)
    {
        if(v[j]==0){
            count++;
            if(count>max)
            {
                max=count;
        
            }
        }
        else
            count=0;
        }
    }

	    return max*2;
    
    }
        
    
};