import java.util.*;
class Solution {
    boolean solution(String s) {

        Stack<Character> stack = new Stack<>();
        // String[] str_arr = s.split("");
        
        for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(i) == '('){
                stack.push('(');
            } else{
                if(stack.isEmpty()) return false;
                stack.pop();
            }
        }
        
        return stack.isEmpty();
            
    }
}