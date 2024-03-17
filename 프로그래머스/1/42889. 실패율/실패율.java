// 1. 총 사용자 수를 파악
// 2. 정렬한다 -> 1번부터 실패율을 구한다. -> 총(분모)는 줄어든다.
// 3. 새로운 배열(new_arr)에 실패율을 저장한다.
// 4. 새로운 배열(new_arr)을 정렬하여 순위를 비교한다.

import java.util.*;
class Solution {
    public int[] solution(int N, int[] stages) {
        
        Arrays.sort(stages);
        int[] count_arr = new int[N+1];
        double[] new_arr = new double[N + 1]; // 1부터
        double[] new_arr_second = new double[N + 1]; // 1부터
        boolean[] visited = new boolean[N + 1]; // 1부터
        
        for(int i = 0 ;  i < stages.length ; i++){
            int num = stages[i];
            if(num <= N) count_arr[num]++;
        }
        System.out.println(Arrays.toString(count_arr));
        
        int total = stages.length;
        for(int i = 1 ; i <= N ; i++){
            if(total <= 0) break;
            new_arr[i] = (double) count_arr[i] / (double) total;
            new_arr_second[i] = (double) count_arr[i] / (double) total;
            total -= count_arr[i];
        }
        
        Arrays.sort(new_arr_second); // 실패율 정렬
        System.out.println(Arrays.toString(new_arr));
        System.out.println(Arrays.toString(new_arr_second));
        
        int[] answer = new int[N];
        int index = 0;
    loop : for(int i = N ; i >= 1  ; i--){
            double temp = new_arr_second[i];
            for(int j = 1 ; j <= N ; j++){
                if(!visited[j] && (temp == new_arr[j])){
                    visited[j] = true;
                    answer[index] = j;
                    index++;
                    continue loop;
                }
            }
        }
        
        return answer;
        
    }
}