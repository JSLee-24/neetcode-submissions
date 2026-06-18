class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> vals = new HashMap<>(); 

        for(int i = 0; i < nums.length; i++) {
            int x = target - nums[i]; 
            if(vals.containsKey(x)) {
                //found a pair
                return new int[] {vals.get(x), i}; 
            }

            vals.put(nums[i], i); 
        }

        return new int[] {}; 
    }
}
