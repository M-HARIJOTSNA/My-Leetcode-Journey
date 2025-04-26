class Solution {
    public boolean ispossible(int[] position, int m, int k){
        int prev= position[0];
        m-=1;
        for(int i=1;i<position.length;i++){
            int val= position[i];
            if(val-prev>=k){
                m--;
                prev = val;
            }
        }
        if(m<=0){
                return true;
            }
            return false;
    }

    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);
       int r = position[position.length - 1] - position[0];
       int l = 1;
        while(l<=r){
            int mid= l+(r-l)/2;
            if(ispossible(position,m,mid)){
              l=mid+1;

            }else{
                r=mid-1;
            }
        }
        return r;
    }
}
