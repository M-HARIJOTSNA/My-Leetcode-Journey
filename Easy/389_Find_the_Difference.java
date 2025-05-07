class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character, Integer> hm= new HashMap<>();
        String str=s.concat(t);
        char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++){
             hm.put(ch[i],hm.getOrDefault(ch[i],0)+1 );
        }
         for (char c : hm.keySet()) {
            if (hm.get(c) % 2 != 0) {
                return c;
        }
    }
        return ' ';
}
}
