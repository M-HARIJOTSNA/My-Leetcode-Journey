class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> hm = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String word = strs[i];
            char[] chArr = word.toCharArray();
            Arrays.sort(chArr);
            String key = new String(chArr);

            if (!hm.containsKey(key)) {
                hm.put(key, new ArrayList<>());
            }
            hm.get(key).add(word);
        }

        return new ArrayList<>(hm.values());
    }
}
