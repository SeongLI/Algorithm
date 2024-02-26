// pq는 최솟값은 구할 수 있지만, 최댓값을 구하는데 한계가 있다!
import java.util.*;
class Solution {
    public int[] solution(String[] operations) {
        PriorityQueue<Integer> min_pq = new PriorityQueue<>();
        PriorityQueue<Integer> max_pq = new PriorityQueue<>(Collections.reverseOrder());
    
        for(int i = 0 ; i < operations.length ; i++){
            String[] temp_arr = operations[i].split(" ");
            String Order = temp_arr[0];
            int value = Integer.parseInt(temp_arr[1]);
            if(Order.equals("I")){ // 삽입
                min_pq.add(value);
                max_pq.add(value);
            } else if (min_pq.isEmpty()) continue;
            else{
                if(value == 1){ // 최댓값 제거
                    int max = max_pq.poll();
                    min_pq.remove(max);
                }else{ // 최솟값 제거
                    int min = min_pq.poll();
                    max_pq.remove(min);
                }
            }
        }
        
        if(min_pq.isEmpty()){
            return new int[] {0, 0};
        }else{
            int max = max_pq.peek();
            int min = min_pq.peek();
            return new int[] {max, min};
        }
        
    }
}