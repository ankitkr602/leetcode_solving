class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        vector<vector<int>>v;
        vector<int>range;
        sort(intervals.begin(),intervals.end());
        range=intervals[0];
        for(int i=0;i<intervals.size();i++)
        {
            if(intervals[i][0]<=range[1])
            {
                range[0]=min(range[0],intervals[i][0]);
                range[1]=max(range[1],intervals[i][1]);
                
            }
            else{
                v.push_back(range);
                range=intervals[i];
            }
        }
        v.push_back(range);
        return v;
        
    }
};