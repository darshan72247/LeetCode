class Solution {
    public String interpret(String command) {
        
        ArrayList<String> arr = new ArrayList<String>();
        
        for(int i=0;i<command.length();){
            if((command.substring(i,i+1)).equals("G")){
                arr.add("G");
                i++;
            } else if((command.substring(i,i+2)).equals("()")){
                arr.add("o");
                i = i+2;
            } else if((command.substring(i,i+4)).equals("(al)")){
                arr.add("al");
                i = i+4;
            }  
        }
        String ans = "";
        for(int i=0;i<arr.size();i++){
            ans += arr.get(i);
        }
        return ans;
    }
}
