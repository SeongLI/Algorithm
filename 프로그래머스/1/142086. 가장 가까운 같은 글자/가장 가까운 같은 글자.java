import java.util.*;
class Solution {
    public int[] solution(String s) {
        HashMap<String, Integer> map = new HashMap<>();
        String[] str_arr = s.split("");
        int[] answer = new int[str_arr.length];
        
        for(int i = 0 ; i < str_arr.length ; i++){
            String temp = str_arr[i];
            int test = map.getOrDefault(temp, -1);
            if(test == -1){
                answer[i] = -1;
            }else{
                answer[i] = i - test;
            }
            map.put(temp, i);
        }
        return answer;
    
    }
}