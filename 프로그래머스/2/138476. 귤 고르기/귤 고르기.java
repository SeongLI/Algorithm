// 크기가 중요한게 아닌듯해
import java.util.*;
class Solution {
    public int solution(int k, int[] tangerine) {
        Arrays.sort(tangerine);
        int value = tangerine[0];
        int point = 0;
        int[] rank = new int[tangerine.length];
        rank[0] = 1;
        
        for(int i = 1 ; i < tangerine.length ; i++){
            if(value == tangerine[i]){
                rank[point] ++;
            }else{
                point++;
                rank[point] ++;
                value = tangerine[i];
            }
        }
        // System.out.println(Arrays.toString(tangerine));
        // System.out.println(Arrays.toString(rank));
        
        Arrays.sort(rank);
        int cnt = 1;
        for(int i = tangerine.length-1 ; i > 0 ; i--){
            k = k - rank[i];
            if(k <= 0) break;
            else cnt ++;
        }
        
        return cnt;
    }
}