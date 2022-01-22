class Solution {
public:
    string intToRoman(int num) {
        string a[]={"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int b[]={1,4,5,9,10,40,50,90,100,400,500,900,1000};
        int i=sizeof(b)/sizeof(int)-1;
        string s="";
        while(num!=0)
        {
          if(num>=b[i]){
              s=s+a[i];
              num=num-b[i];}
            else
                i--;
        }
        return s;
        
    }
};