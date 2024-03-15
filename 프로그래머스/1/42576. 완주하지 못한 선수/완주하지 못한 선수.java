import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < participant.length; i++){
            int temp_count = map.getOrDefault(participant[i], 0);
            map.put(participant[i], temp_count + 1);
        }
        
        for(int i = 0 ; i < completion.length ; i++){
            int temp_update = map.get(completion[i]);
            map.put(completion[i], temp_update-1);
        }
        
        for(String key : map.keySet()){
            if(map.get(key) != 0) return key;
        }
        
        return "gg";
    }
}