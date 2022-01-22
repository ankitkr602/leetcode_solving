class Solution {
public:
    vector<int> twoSum(vector<int>&A, int N) {
unordered_map<int,int>m;
vector<int>a;
for(int i=0;i<A.size();i++)
{
    if(m[N-A[i]])
    {
        a.push_back(m[N-A[i]]-1);
        a.push_back(i);
        return a;
    }
    else if(m[A[i]]==0)
    {
        m[A[i]]=i+1;
    }
}
return a;
        
    }
};