class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        vector<vector<int>>v;
        vector<int>v1(2);
        pair<int,int>range;
        sort(intervals.begin(),intervals.end());
        //for(int i=0;i<)
        range=make_pair(intervals[0][0],intervals[0][1]);
        for(int i=0;i<intervals.size();i++)
        {
            if(intervals[i][0]<=range.second)
            {
                range.first=min(range.first,intervals[i][0]);
                range.second=max(range.second,intervals[i][1]);
                
            }
            else{
                v1[0]=(range.first);
                v1[1]=(range.second);
                v.push_back(v1);
                range.first=intervals[i][0];
                range.second=intervals[i][1];
            }
        }
        v1[0]=(range.first);
                v1[1]=(range.second);
                v.push_back(v1);
        return v;
        
    }
};