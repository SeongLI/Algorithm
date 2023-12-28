import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] arr = new int[speeds.length];
        
        for(int i = 0 ; i < speeds.length ; i++){
            int remain = 100 - progresses[i]; 
            if(remain % speeds[i] == 0) arr[i] = remain / speeds[i];
            else arr[i] = remain / speeds[i] + 1;
        }
        
        System.out.println(Arrays.toString(arr));
        
        Queue<Integer> q = new LinkedList<>();
        int temp_sum = 1;
        int temp_point = 0;
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[temp_point] < arr[i] ) {
                q.add(temp_sum);
                temp_sum = 1;
                temp_point = i;
            }else{
                temp_sum ++;
            }
        }
        q.add(temp_sum); // 마지막
        
        int size = q.size();
        int[] answer = new int[size]; 
        for(int i = 0 ; i < size ; i++){
            answer[i] = q.poll();
        }
        
        System.out.println(Arrays.toString(answer));
        
        
        return answer;
    }
}