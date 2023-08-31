import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        Queue<Integer> q = new LinkedList<>();
        
        for(int i = 0 ; i < num_list.length ; i += n){
            q.add(num_list[i]);
        }
        
        int[] result = new int[q.size()];
        for(int i = 0 ; i < result.length ; i++){
            result[i] = q.poll();
        }
        return result;
    }
}