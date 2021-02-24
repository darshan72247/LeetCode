class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<String,Integer> copy = new HashMap<String,Integer>();
        
        for(int i = 0; i < s.length() ; i++){
            if(copy.containsKey(s.substring(i,i+1))){
               int value = copy.get(s.substring(i,i+1)); 
               value++;
               copy.put(s.substring(i,i+1),value); 
            } else {
                copy.put(s.substring(i,i+1),1);
            }
        }
        
        for(int i = 0; i < s.length(); i++){
            if(copy.get(s.substring(i,i+1)) == 1){
                return i;
            }
        }
        return -1;
    }
}

















