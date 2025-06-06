class Solution {
    public int[] productExceptSelf(int[] a) {
        int product =1;
		int count =0;
		int output[] = new int[a.length];
		for(int i = 0 ;i<a.length;i++){
		    if(a[i]== 0){
            count++;
            continue;
		    }
		    product *= a[i];
		}
		//System.out.println(product);
		for(int i =0;i<a.length;i++){
		    if(count >1){
		    output[i] = 0;
		    }
		    else if(count ==1){
		        
		        if(a[i]==0)
		        output[i]=product;
		        else
		        output[i] = 0;
		    }
		    else if(count == 0)
		    output[i] = product/a[i];
		}
		
	return output;
    
    }
}