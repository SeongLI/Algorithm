import java.util.*;
class Solution {
    public int[] solution(int n) {

        Stack<Integer> stack = new Stack<>();
        
        for(int i = 1 ; i <= n ; i++){
            if( i%2 != 0 ){
                stack.push(i);
            }
        }
        
        int[] answer = new int[stack.size()];
        for(int i = 0 ; i < answer.length ; i++){
            answer[i] = stack.pop();
        }
        Arrays.sort(answer);
            
        return answer;
    }
}