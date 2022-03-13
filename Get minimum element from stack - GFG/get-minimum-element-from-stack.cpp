// { Driver Code Starts
#include <bits/stdc++.h>
using namespace std;


 // } Driver Code Ends
/*
The structure of the class is as follows
class _stack{
stack<int> s;
int minEle;
public :
    int getMin();
    int pop();
    void push(int);
};
*/

class Solution{
    int minEle;
    stack<int> s;
    stack<int> min_stack;
    public:
    
       /*returns min element from stack*/
       int getMin(){
           
           //Write your code here
           if(min_stack.empty())
           return -1;
           else 
           return min_stack.top();
       }
       
       /*returns poped element from stack*/
       int pop(){
           
           //Write your code here
           
           if(!s.empty())
           {
             int t=s.top();
             s.pop();
             min_stack.pop();
             return t;
           }
          else return -1;
       }
       
       /*push element x into the stack*/
       void push(int x){
           
           if(s.empty()){
           min_stack.push(x);
           }
           else if(min_stack.top()>x){
               min_stack.push(x);
           }
           else if(min_stack.top()<=x){
               min_stack.push(min_stack.top());
           }
           s.push(x);
           
           //Write your code here
       }
};

// { Driver Code Starts.

int main()
 {
    long long t;

    cin>>t;
    while(t--)
    {
        int q;
        cin>>q;
        Solution ob;
        while(q--){
           int qt;
           cin>>qt;
           if(qt==1)
           {
              //push
              int att;
              cin>>att;
              ob.push(att);
           }
           else if(qt==2)
           {
              //pop
              cout<<ob.pop()<<" ";
           }
           else if(qt==3)
           {
              //getMin
              cout<<ob.getMin()<<" ";
           }
       }
       cout<<endl;
    }
    return 0;
}
  // } Driver Code Ends