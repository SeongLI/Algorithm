import java.util.*;
class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0 ; i < keymap.length ; i++){
            String[] temp_arr = keymap[i].split("");
            for(int j = 0 ; j < temp_arr.length ; j++){
                int temp_value = map.getOrDefault(temp_arr[j], 0);
                if( temp_value == 0 || temp_value > j+1){
                    map.put(temp_arr[j], j+1);
                }
            }
        }
        
        int[] answer = new int[targets.length];
        
     loop : for(int i = 0 ; i < targets.length ; i++){
            int sum = 0;
            String[] str_arr = targets[i].split("");
            for(String str : str_arr){
                int str_value = map.getOrDefault(str, -1);
                if(str_value == -1){
                    answer[i] = -1;
                    continue loop;
                }else{
                    sum+= str_value;
                }
            }
            answer[i] = sum;
        }
        return answer;
    
    }
}