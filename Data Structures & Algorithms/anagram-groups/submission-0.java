class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> ans = new HashMap<>(); 
        final int LETTERS = 26; 

        for(String s : strs) {
            int[] count = new int[LETTERS]; 
            
            for(char c : s.toCharArray()) {
                count[c - 'a']++; 
            }

            String key = Arrays.toString(count); 

            if(!ans.containsKey(key)) {
                ans.put(key, new ArrayList<>());
            }

            ans.get(key).add(s);
        }

        return new ArrayList<>(ans.values());
    }
}
