import java.util.*;
class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> stack = new Stack<>();
        
        int len = arr.length;
        for(int i = 0 ; i < len ; i++){
            int j = 0;
            if(flag[i]){
                while(j < arr[i]*2){
                    stack.push(arr[i]);
                    j++;
                }
            }else{
                while(j < arr[i]){
                    stack.pop();
                    j++;
                }
            }
        } // for문 끝
        int size = stack.size();
        int[] result = new int[size];
        for(int i = 0 ; i < size ; i++){
            result[i] = stack.remove(0);
        }
        
        return result;
        
    }
}