class Solution {
public:
    vector<int> create(int t){
        vector<int>v1;
        int ch=1;
        v1.push_back(ch);
        for(int i=1;i<=t;i++)
        {
           ch=((t-i+1)*ch)/i;
           v1.push_back(ch);
        }
        return v1;
    }
    vector<vector<int>> generate(int numRows) {
        vector<vector<int>>v;
        vector<int>q{1};
        v.push_back(q);
        for(int i=1;i<numRows;i++)
        {
           v.push_back(create(i));
        }
        return v;
    }
};