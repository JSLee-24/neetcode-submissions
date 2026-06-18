class Solution {
    public List<Integer> partitionLabels(String s) {
        Map<Character, Integer> chars = new HashMap<>(); 
        List<Integer> ans = new ArrayList<>(); 
        int i = 0;
        int length = s.length(); 
        int currLen = 0; 
        int end = 0; 
        char c; 

        for(int j = 0; j < length; j ++) {
            c = s.charAt(j); 
            chars.put(c, j); 
        }


        while(i < length) {
            c = s.charAt(i);
            end = Math.max(end, chars.get(c)); 
            currLen++; 

            if(i == end) {
                ans.add(currLen);
                currLen = 0; 
            }
            
            i++;
        }

        return ans; 
    }
}
