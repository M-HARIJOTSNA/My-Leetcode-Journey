class Solution {
    public double average(int[] salary) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        double temp=0;
        double count=0;
        for(int i=0;i<salary.length;i++){
            min=Math.min(min,salary[i]);
            max=Math.max(max,salary[i]);
        }
        for(int i=0;i<salary.length;i++){
            if(salary[i]!=min && salary[i]!=max){
                temp+=salary[i];
                count++;
            }
        }
       return temp/count;       
    }
}
