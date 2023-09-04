import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        Queue<Integer> q = new LinkedList<>();
        
        String[] str_arr = my_string.split("");
        for(int i = 0 ; i < str_arr.length ; i++){
            if(Character.isDigit(str_arr[i].charAt(0))){
                int temp = Integer.parseInt(str_arr[i]);
                q.add(temp);
                }
            }
        
        int len = q.size();
        int[] answer = new int[len];
        for(int i = 0 ; i < len ; i++){
            answer[i] = q.poll();
        }
        Arrays.sort(answer);
        return answer;
    }
}