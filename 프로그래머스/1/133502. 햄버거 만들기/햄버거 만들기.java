import java.util.*;
class Solution {
    public int solution(int[] ingredient) {
        Stack<Integer> stack = new Stack<>();
        int cnt = 0;

        for(int i = 0 ; i < ingredient.length ; i++){
            stack.add(ingredient[i]);
            
            if((stack.size() >= 4) && (ingredient[i] == 1)){
                int d = stack.pop();
                int c = stack.pop();
                if(c != 3){
                    stack.add(c);
                    stack.add(d);
                    continue;
                }
                int b = stack.pop();
                if(b != 2){
                    stack.add(b);
                    stack.add(c);
                    stack.add(d);
                    continue;
                }
                int a = stack.pop();
                if(a != 1){
                    stack.add(a);
                    stack.add(b);
                    stack.add(c);
                    stack.add(d);
                    continue;
                }
                cnt++;
            }
        } // for 끝
        
        return cnt;
    }
}