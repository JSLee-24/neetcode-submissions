class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> vals = new HashMap<>(); 

        for(int i = 0; i < nums.length; i++) {
            if(vals.containsKey(nums[i]))
                return true; 
            
            vals.put(nums[i], i);
        }

        return false;
    }
}
