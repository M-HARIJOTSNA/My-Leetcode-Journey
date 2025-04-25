class Solution {
    public boolean ispossible(int n, int[] quantities, int limit) {
        int mean= 0;
		
		int sum=0;
		for(int i=0;i<quantities.length;i++) {
			
			sum=quantities[i];
			mean=sum/limit;
           if(sum%limit!=0) {
        	  mean++;
        	  
           }
          n-=mean;

		}
        if(n<0){
            return false;

        }
        return true;
        
    }
    public int minimizedMaximum(int n, int[] quantities){
        int l=1;
        int r=Integer.MAX_VALUE;
         while(l<=r){
        int mid=l+(r-l)/2;
        if(ispossible(n, quantities,mid)){
            r=mid-1;
        }else{
            l=mid+1;
        }
         }
         return l;
    }
}
