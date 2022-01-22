class Solution {
public:
    int romanToInt(string s) {
        int sum=0;
        //vector<int>::iterator it;
vector<char>v={'I','V','X','L','C','D','M'};
        int a[]={1,5,10,50,100,500,1000};
        for(int i=0;i<s.length();i++)
        {
            string k=s.substr(i,1)+s.substr(i+1,1);
            if(k=="IV"){
                sum=sum+4;
            i=i+1;}
        else if(k=="IX"){
             sum=sum+9;
            i=i+1;}
        else if(k=="XL"){
             sum=sum+40;
             i=i+1;}
         else if(k=="XC"){
             sum=sum+90;
             i=i+1;}
        else if(k=="CD"){
             sum=sum+400;
             i=i+1;}
       else if(k=="CM")
       {
             sum=sum+900;
             i=i+1;
           
       }
             
        else
         {
             auto it=std::find(v.begin(),v.end(),s[i]);
                if(it!=v.end())
                sum=sum+a[it-v.begin()];
        }


    }
        return sum;
    
        
    }
};