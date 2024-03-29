import java.util.*;
class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0 ; i < name.length ; i++){
            map.put(name[i], yearning[i]);
        }
        
        int[] answer = new int[photo.length];
        for(int i = 0 ; i < photo.length ; i++){
            int point = 0;
            for(int j = 0 ; j < photo[i].length ; j++){
                // point += map.getOrDefault(photo[i][j], 0);    
                if(map.containsKey(photo[i][j])) point+= map.get(photo[i][j]);
            }
            answer[i] = point;
        }
        return answer;
    
    }
}