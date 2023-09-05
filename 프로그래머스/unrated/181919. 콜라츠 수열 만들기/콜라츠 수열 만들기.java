import java.util.*;
class Solution {
    public int[] solution(int n) {
        Queue<Integer> q = new LinkedList<>();
        
        while(n > 0){
            q.add(n);
            if(n==1) break;
            if(n % 2 == 0){
                n /= 2 ;
                // q.add(n);
            } else{
                n = 3 * n + 1;
                // q.add(n);
            }
        }
        
        int len = q.size();
        int[] result = new int[len];
        for(int i = 0 ; i < len ; i++){
            result[i] = q.poll();
        }
        return result;
    }
}