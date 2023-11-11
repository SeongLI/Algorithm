class Solution {
    public boolean solution(String s) {
        
        if(s.length() == 4 || s.length() == 6){
            for(int i = 0 ; i < s.length() ; i++){
                char temp = s.charAt(i);
                if(temp-'0' < 0 || temp-'0' >9) return false;
            }
            
            return true;
        }
        
        return false;
        
    }
}