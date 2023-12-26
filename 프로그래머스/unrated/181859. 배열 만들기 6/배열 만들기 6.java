import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        
        int arr_len = arr.length;
        int point = 0;
        
        for(int i = 0 ; i < arr_len; i++){
            if(stack.isEmpty()) stack.add(arr[i]);
            else{
                if(stack.peek() == arr[i]){
                    stack.pop();
                }
                else{
                    stack.push(arr[i]);
                }
            }
            // System.out.println(Arrays.toString(stack.toArray()));
        }
        
        int size = stack.size();
        // System.out.println(size);
        if(size == 0) {
            stack.push(-1);
            size = 1;
        }
        int[] answer = new int[size];
        for(int i = size-1 ; i >= 0 ; i--){
            answer[i] = stack.pop();
        }
        
        
        return answer;
        
        
    }
}