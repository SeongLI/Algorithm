import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        
        Arrays.sort(d);
        int result = 0;
        for(int i = 0 ; i <  d.length ; i++){
            if(budget < d[i]) break;
            
            budget -= d[i];
            result ++;
        }
        return result;
    }
}