class Solution {
    public boolean isPossible(int[] candies, long k,int mid){
           long upper=0;
        for(int i=0;i<candies.length;i++){
            upper += candies[i] / mid ;
        }
        return upper>=k;
     }
    public int maximumCandies(int[] candies, long k) {
        int r=10000000;
        int l=1;
        int res=0;
        while(l<=r){
            int mid= l+(r-l)/2;
         if(isPossible(candies, k, mid)){
            res=mid;
            l=mid+1;
          }else{
            r=mid-1;
        }
    }
        return res;
        }
}
