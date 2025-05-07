class Solution {
    public char repeatedCharacter(String s) {
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            hm.put(c, hm.getOrDefault(c, 0) + 1);
            if (hm.get(c) == 2) {
                return c;
            }
        }
        return ' ';
    }
}
