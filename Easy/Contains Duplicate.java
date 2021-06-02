class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> values = new HashSet<Integer>();
        
        for(int i=0; i<nums.length;i++){
            if(values.contains(nums[i])){
                return true;
            } else {
                values.add(nums[i]);
            }
        }
        return false;
    }
}
