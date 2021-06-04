// Better running time than the previous Solution
class Solution {
    public String interpret(String command) {
        
         StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<command.length();){
            switch(command.charAt(i)){
                case 'G':
                    sb.append("G");
                    i++;
                    break;
                case '(':
                    if(command.charAt(i+1) == ')'){
                        sb.append("o");
                        i += 2;
                    } else {
                        sb.append("al");
                        i += 4;
                    }
            }
        }
    
        
        return sb.toString();
    }
}
