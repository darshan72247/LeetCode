class Solution {
    public int findNumbers(int[] nums) {
        
        int evenNumbers = 0;
        
        for(int i=0;i<nums.length;i++){
            int number =nums[i];
            int evenOrOdd = 0;
            while(number != 0){
                number = number / 10;
                evenOrOdd += 1;
            }
            if(evenOrOdd % 2 == 0){
                evenNumbers += 1;
            }
        }
        return evenNumbers;
    }
}
