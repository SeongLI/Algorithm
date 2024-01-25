import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
    
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < win_nums.length ; i++){
            map.put(win_nums[i], 1);
        }
        
        int zero = 0;
        int rank = 7;
        for(int i = 0 ; i < lottos.length ; i++){
            int lotto = lottos[i] ;
            
            if(lotto == 0) zero++ ;
            else{
                int temp = map.getOrDefault(lotto, -1);
                if(temp != -1) rank --;
            }
        }
        int win = rank - zero;
        if( win >= 6 ) win = 6;
        int lose = rank;
        if(lose >= 6 ) lose = 6;
        
        return new int[]{win, lose};
    }
}