import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 내림차순 정렬
        
        for(int i = 0 ; i < priorities.length ; i++){
            pq.add(priorities[i]);
        }
        
        int ans = 1;
        
        while(!pq.isEmpty()){
             System.out.println("pq : " + pq);

            for(int i = 0 ; i < priorities.length; i++){
                if(priorities[i] == pq.peek()){
                    if(i == location) return ans;
                    pq.poll();
                    ans ++;
                }
            }
        }
        return -1;
        
    }
}