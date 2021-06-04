class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        
        ArrayList<Integer> target = new ArrayList<Integer>();
        
        for(int i=0;i<index.length;i++){
            target.add(index[i],nums[i]);
        }
        
      // Copying element from arraylist to int array
        int[] ans = new int[index.length];
        
        for(int i=0;i<target.size();i++){
            ans[i] = target.get(i);
        }
        
        return ans;
        
    }
}
