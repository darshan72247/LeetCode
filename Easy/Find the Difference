class Solution {
    public char findTheDifference(String s, String t) {
        
     HashMap<Character,Integer> copy = new HashMap<Character,Integer>();
        
        for(int i = 0; i < t.length() ; i++){
            if(copy.containsKey(t.charAt(i))){
               int value = copy.get(t.charAt(i)); 
               value++;
               copy.put(t.charAt(i),value); 
            } else {
                copy.put(t.charAt(i),1);
            }
        }
        
        
        for(int i = 0; i < s.length() ; i++){
            if(copy.containsKey(s.charAt(i))){
               int value = copy.get(s.charAt(i)); 
               value--;
               copy.put(s.charAt(i),value); 
            } 
        }
        
        for(int i=0;i<t.length();i++){
            int value = copy.get(t.charAt(i));
            if(value == 1){
                return t.charAt(i);
            }
        }
        
        return '_';
    }
}
