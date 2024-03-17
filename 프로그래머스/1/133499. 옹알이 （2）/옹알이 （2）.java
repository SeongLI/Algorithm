import java.util.*;
class Solution {
    public static String[] list = {"aya", "ye", "woo", "ma"};
    public static String[] double_list = {"ayaaya", "yeye", "woowoo", "mama"};
    public int solution(String[] babbling) {
        Arrays.sort(list);
        Arrays.sort(double_list);
        Arrays.sort(babbling);
        
        int cnt = 0;
        for(int i = 0 ; i < babbling.length ; i++){
            String unit = babbling[i];
            for(int j = 0 ; j < list.length ; j++){
                if(unit.contains(double_list[j])) continue;
                unit = unit.replace(list[j], " ");
            }
            unit = unit.replace(" ", "");
            
            if(unit.equals("")) cnt++;
        }
        return cnt;
    
    }
}