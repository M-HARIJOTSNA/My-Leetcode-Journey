class Solution {
    public int characterReplacement(String s, int k) {
                int counta=0;
                int ans=0;
                int l=0;
                int[] freq = new int[26];
                char temp=0;
                for(int r=0; r<s.length();r++){
                    char ch= s.charAt(r);
                 freq[ch - 'A']++;
                counta = Math.max(counta, freq[ch - 'A']);

             while ((r - l + 1) - counta > k) {
                char leftchar = s.charAt(l);
                freq[leftchar - 'A']--;
                l++;
            }
            ans= Math.max(ans, r-l+1);

          } 
         return ans;
    }
}
          
            
     
