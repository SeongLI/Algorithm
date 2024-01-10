import java.util.*;
class Solution{
    public int solution(String s){
        Stack<String> stack = new Stack<>();
        String[] str_arr = s.split("");
        for(int i = 0 ; i < str_arr.length ; i++){
            if(stack.isEmpty()){
                stack.add(str_arr[i]);
            }else{
                String temp = stack.peek();
                if(temp.equals(str_arr[i])){
                    stack.pop();  
                } else{
                    stack.add(str_arr[i]);
                }
            }
        }
        if(stack.isEmpty()) return 1;
        else return 0;
    
    }
}