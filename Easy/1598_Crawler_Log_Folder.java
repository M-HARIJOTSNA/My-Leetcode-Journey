class Solution {
    public int minOperations(String[] logs) {
        Stack<String> st=new Stack<>();
        int count=0;
        for(int i=0;i<logs.length;i++){
            String s=logs[i];
            if(s.equals("../")){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else if(s.equals("./")){

            }else{
                st.push(s);
            }
        }
        return st.size();
        
    }
}
