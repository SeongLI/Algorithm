import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0 ; i < arr.length ; i++){
            int temp = arr[i];
            if(stack.isEmpty()){
                stack.push(temp);
            }else{
                int stack_temp = stack.peek();
                if(stack_temp == temp){
                    stack.pop();
                }else{
                    stack.push(temp);
                }
            }
        }
        int size = stack.size();
        if(size == 0) return new int[]{-1};
        int[] ans = new int[size];
        for(int i = size-1 ; i >= 0 ; i--){
            ans[i] = stack.pop();
        }
        return ans;
    }
}