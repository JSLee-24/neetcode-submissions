class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> letters = new HashMap<>(); 
        char c; 

        for(int i = 0; i < s.length(); i++) {
            c = s.charAt(i);

            if(letters.containsKey(c)) {
                letters.put(c, letters.get(c) + 1); 
            }
            else {
                letters.put(c, 1); 
            }
        }

        System.out.println(letters); 

        for(int i = 0; i < t.length(); i++) {
            c = t.charAt(i); 

            if(letters.containsKey(c)) {
                letters.put(c, letters.get(c) - 1); 

                if(letters.get(c) == 0)
                    letters.remove(c); 
            }
            else {
                return false;
            }
        }

        System.out.println(letters); 

        return letters.isEmpty(); 
    }
}
