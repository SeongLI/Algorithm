import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        // FIFO 큐를 사용하자
        Queue<Integer> que = new LinkedList<>();
        
        // 0을 가득 채우고 => 밀어내자
        for(int i = 0 ; i < bridge_length ; i++) que.add(0);
        // 다리 위 무게의 총 합
        int total_sum = 0;
        // 트럭을 지정
        int point = 0;
        // 누적 시간
        int time = 0;
        
        while(point < truck_weights.length){
            // 우선 빼자
            int temp = que.poll();
            total_sum -= temp;
            // 차량이 올라갈수 있니?
            if(total_sum + truck_weights[point] <= weight){
                total_sum += truck_weights[point];
                que.add(truck_weights[point]);
                point ++;
            } else{
                que.add(0);
            }
            
            time ++;
        }
        
        System.out.println(Arrays.toString(que.toArray()));
        
        // 포인트가 마지막 인덱스 까지 갔다면
        while(!que.isEmpty()){
            que.poll();
            time++;
        }
        
        return time;
        
    
    }
}