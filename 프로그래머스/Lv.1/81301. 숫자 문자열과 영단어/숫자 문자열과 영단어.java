import java.util.*;
class Solution {
    public static HashMap<String, Integer> map;
    public int solution(String s) {
        map = new HashMap<>();
        Map();
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            // 숫자는 패스 
            if(s.charAt(i) < 'a') {
                sb.append(s.charAt(i));
                continue;
            }
            
            for(int j = i+1 ; j <= s.length() ; j ++){
                String temp_str = s.substring(i, j);
                int check = map.getOrDefault(temp_str,-1);
                
                if(check != -1){ // map에 들어있으면
                // if(map.containsKey(temp_str)){
                    sb.append(check);
                    i = j-1;
                    break;
                }
            }
        }
        int ans = Integer.parseInt(sb.toString());
        return ans;
        
        
    }
    
    public static void Map(){
        map.put("zero", 0);
        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);
        map.put("four", 4);
        map.put("five", 5);
        map.put("six", 6);
        map.put("seven", 7);
        map.put("eight", 8);
        map.put("nine", 9);
    }
}