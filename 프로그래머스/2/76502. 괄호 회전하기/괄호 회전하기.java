import java.util.*;
class Solution {
    public int solution(String s) {

        int ans = 0;
        
        for(int i = 0 ; i < s.length() ; i++){
            String temp = "";
            for(int j = i ; j < s.length() ; j++){
                temp += s.charAt(j);
            }
            for(int j = 0 ; j < i ; j++){
                temp += s.charAt(j);
            }
            
            Stack<Character> stack = new Stack<>();
            for(int k = 0 ; k < temp.length() ; k++){
                char unit = temp.charAt(k);
                
                if(!stack.isEmpty()) {
                    char temp_unit = stack.peek();
                    
                    if(unit == reverse_check(temp_unit)){
                        stack.pop();
                    }else{
                        stack.add(unit);
                    }
                }else{
                    stack.add(unit);
                }
            }
            if(stack.isEmpty()) ans++;
        }
        
        return ans;
        
    }
    
    public static Character reverse_check(char temp){
        if(temp == '[') return ']';
        if(temp == '(') return ')';
        if(temp == '{') return '}';
        return '@';
    }
}