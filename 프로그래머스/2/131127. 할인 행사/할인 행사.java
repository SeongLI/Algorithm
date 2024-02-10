import java.util.*;
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        
        int ans = 0;
        
loop : for(int i = 0 ; i <= discount.length - 10 ; i++){
            // map 초기화
            HashMap<String, Integer> map = new HashMap<>();
            for(int j= 0 ; j < want.length ; j++){
                map.put(want[j], number[j]);
            }
            
            int count = 0;
            for(int j = i ; j < i+10 ; j++){
                count ++;
                String str = discount[j];
                int check_count = map.getOrDefault(str, -1);
                // System.out.println("str ? " + str + "  check_count ? " + check_count);
                if( check_count > 0 ){
                    map.put(str, check_count - 1);
                } else continue loop;
            }
    
            if(count == 10){
                ans ++;
            }
        } // loop for 끝
        return ans;
    }
}