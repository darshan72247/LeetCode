// class Solution {
//     public int[] twoSum(int[] nums, int target) {
    
//     //inserting values into hash table get better big O
//     HashMap<Integer, Integer> numbers = new HashMap<Integer,Integer>();
//     for(int i=0;i<nums.length;i++){
//         numbers.put(nums[i],i);
//     }
        
    
//     ArrayList<Integer> answer = new ArrayList<Integer>();
//     for(int x=0;x<nums.length;x++){
//       int difference = target - nums[x];
//       if(numbers.containsKey(difference)){
//           int position = numbers.get(difference);
//           // if(position != x){
//             System.out.println(position);
//             answer.add(position);
//           // }
//       }
//     }
        
//     //coverting to int array from arraylist
//     int[] ret = new int[answer.size()];
//     for (int i=0; i < ret.length; i++)
//     {
//         ret[i] = answer.get(i).intValue();
//     }

//     return ret;
//     }
// }

/*---------------------------- BETTER RUNNING TIME THAN ABOVE SOLUTION ------------------*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
    
    // inserting values into hash table get better big O
    HashMap<Integer, Integer> numbers = new HashMap<Integer,Integer>();

    for(int x=0;x<nums.length;x++){
      int difference = target - nums[x];
      if(numbers.containsKey(difference)){
          return new int[]  {x,numbers.get(difference)};
      } else {
          numbers.put(nums[x],x);
      }
    }
        return null;

    }
}
