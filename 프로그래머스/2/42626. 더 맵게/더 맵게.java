import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i : scoville){
            pq.add(i);
        }
        int cnt = 0;
        
        while(pq.peek() < K){
            if(pq.size() == 1) return -1;
            
            int small = pq.poll();
            int big = pq.poll();
            
            pq.add(small + big*2);
            cnt++;
        }
        return cnt;
    
    }
}