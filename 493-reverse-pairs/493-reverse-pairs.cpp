class Solution {
public:
    void merge(int *arr,int *arr1,int *arr2,int len1,int len2,int &count)
{
    arr=arr1;
    int k=0,i=0,j=0;
//   // int len1=sizeof(arr1)/sizeof(int);
//     cout<<len1;
//     int len2=sizeof(arr2)/sizeof(int);
//     cout<<len2;
int temp1[len1];
int temp2[len2];


for(int a=0;a<len1;a++)
temp1[a]=arr1[a];
for(int b=0;b<len2;b++)
temp2[b]=arr2[b];

// int part=0;
// for(int t=0;t<len2;t++)
// {
//     int s=part,e=len1-1;
//     while(s<=e){
//         int m=(s+e)/2;
//         if(temp1[m]>2L*temp2[t])
//         e--;
//         if(temp1[m]<=2L*temp2[t])
//         s++;
//         }
//         part=s;
//         count+=len1-part;
// }
        while(i<len1 && j<len2)
        {
            if(temp1[i]>2L*temp2[j])
            {
                count+=len1-i;
                j++;
            }
            else i++;
        }
        i=0;j=0;

    while(i<len1 && j<len2)
    {
        if(temp1[i]<=temp2[j])
        {
            arr[k]=temp1[i];i++;
        }
        else
        {
            
            arr[k]=temp2[j];j++;
        }
        k++;
    }
    if(i<len1){
        while(i<len1){
            arr[k]=temp1[i];
            i++;
            k++;
        }
    }
    if(j<len2){
        while(j<len2){
            arr[k]=temp2[j];
            j++;
            k++;
        }
    }
    // for(int p=0;p<len1+len2;p++)
    //  cout<<arr[p];
    //  cout<<endl;
     
}
int* Mergesort(int *arr,int start,int end,int &count)
{
    //cout<<"present";
    if(start==end)
    return arr+start;
    int mid=(start+end)/2;
   int *arr1= Mergesort(arr,start,mid,count);
   //cout<<arr1[0]<<"arr1";
   int *arr2=Mergesort(arr,mid+1,end,count);
   //cout<<arr2[0]<<"arr2";
   merge(arr,arr1,arr2,(mid-start)+1,end-mid,count);
   return arr+start;
}

    int reversePairs(vector<int>& nums) {
        int *arr=&nums[0];
        int count=0;
        Mergesort(arr,0,nums.size()-1,count);
        return count;
    }
};