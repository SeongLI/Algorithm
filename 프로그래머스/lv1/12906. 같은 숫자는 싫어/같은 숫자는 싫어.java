import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Queue<Integer> q = new LinkedList<>();
        int temp = -1;
        
        for(int i = 0 ; i < arr.length ; i++){
            if(temp != arr[i]){
                q.add(arr[i]);
                }                
                temp = arr[i];
        }
        int size = q.size();
        int[] answer = new int[size];
        for(int i = 0 ; i < size ; i++){
            answer[i] = q.poll();
        }

        return answer;
    }
}