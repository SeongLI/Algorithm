import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        // 2중 for문 => 시간초과 (O^2)
        boolean[] visited = new boolean[numbers.length];
        // 스택에는 인덱스를 넣는다.
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0 ; i < numbers.length ; i++){
            // 비어있지 않고, 뒷 수가 크면
            while(!stack.isEmpty() && numbers[stack.peek()] < numbers[i]){
                // 업데이트
                visited[stack.peek()] = true;
                numbers[stack.pop()] = numbers[i];
            }
            stack.push(i);
        }
        
            
        for(int i = 0 ; i < numbers.length ; i++){
            if(!visited[i]) numbers[i] = -1;
        }
        
        return numbers;
    }
}