import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        
        // (얼굴 + 1) x (상의 + 1) x (하의 + 1) x (겉옷 + 1) - 1
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < clothes.length ; i ++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);        
            // map.put(clothes[i][1], map.get(clothes[i][1] + 1));    
            // >> NullPointerException을 발생시킬 수 있다. 
        }
         
        int cal = 1;
        for(int count : map.values()){
            cal *= (count + 1);
        }
        return cal - 1 ;
    }
    
}