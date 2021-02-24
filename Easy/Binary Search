class Solution {
    public int search(int[] nums, int target) {
        int high = nums.length -1;
        int low = 0;
        
        while(low <= high){
            
            int mid = (high + low)/2;
            int guess = nums[mid];
            
            if(guess == target){
                return mid;
            }
            
            if(guess < target){
                low = mid + 1;
            }
            
            if(guess > target){
                high = mid - 1;
            }
        }
        return -1;
    }
}
