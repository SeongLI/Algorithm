import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0 ; i < works.length ; i++){
            pq.add(works[i]);
        }
        
        // n번 돌려
        for(int i = 0 ; i < n ; i ++){
            int temp = pq.poll();
            if(temp == 0) return 0;
            pq.add(temp-1);
        }
        
        long ans = 0;
       while (!pq.isEmpty()) {
            ans += Math.pow(pq.poll(), 2);
        }
        return ans;
        
    }
}