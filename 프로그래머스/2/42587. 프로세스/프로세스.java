import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); // 내림차순 정렬
        
        for(int i = 0 ; i < priorities.length ; i++){
            pq.add(priorities[i]);
        }
        
        int answer = 1;
        while(!pq.isEmpty()){
            for(int i = 0 ; i < priorities.length ; i++){
                if(priorities[i] == pq.peek()){
                    if(i == location) return answer;
                    answer++;
                    pq.poll();
                } 
            }
        }
        return -1;
        
    }
}