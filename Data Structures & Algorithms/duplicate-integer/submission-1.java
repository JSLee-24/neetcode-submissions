class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> vals = new ArrayList<>(); 

        for(int i = 0; i < nums.length; i++) {
            if(vals.contains(nums[i]))
                return true; 
            
            vals.add(nums[i]);
        }

        return false;
    }
}
