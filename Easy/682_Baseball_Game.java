class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<operations.length;i++){
            String op=operations[i];
            if(op.equals("+")){
                int to=st.pop();
                int to2=st.peek();
                 st.push(to);
                st.push(to+to2);
            }else if(op.equals("C")){
                st.pop();
            }else if(op.equals("D")){
                int to=st.peek();
                st.push(2*to);
            }else{
                st.push(Integer.valueOf(op));
            }
        }
        int ans=0;
        for(int i:st){
            ans+=i;
        }
        return ans;
    }
}
