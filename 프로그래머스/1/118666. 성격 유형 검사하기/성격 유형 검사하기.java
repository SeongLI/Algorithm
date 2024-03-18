// 분리하고 => 숫자에 따라 점수부여 
import java.util.*;
class Solution {
    public String solution(String[] survey, int[] choices) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('R', 0); map.put('T', 0); map.put('C', 0); map.put('F', 0);
        map.put('J', 0); map.put('M', 0); map.put('A', 0); map.put('N', 0);
        for(int i = 0 ; i < survey.length ; i++){
            String temp = survey[i];
            char first = temp.charAt(0);
            char second = temp.charAt(1);
            
            int score = choices[i];
            int insert_score = Math.abs( 4 - score );
            if(score <= 4){
                map.put(first, map.getOrDefault(first, 0) + insert_score );
            } else{
                map.put(second, map.getOrDefault(second, 0) + insert_score );
            }         
        }
        
         String result = "";
            if(map.get('R') >= map.get('T')) result += "R"; 
                else result += "T";
            if(map.get('C') >= map.get('F')) result += "C"; 
                else result += "F";
            if(map.get('J') >= map.get('M')) result += "J"; 
                else result += "M";
            if(map.get('A') >= map.get('N')) result += "A"; 
                else result += "N";
            
            return result;
    }
}