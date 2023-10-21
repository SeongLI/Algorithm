import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        int[] cnt_arr = new int[n+2];
        // 초기 셋팅
        for(int i = 0 ; i <= n ; i++){
            cnt_arr[i] ++;
        };
        // 여벌옷 인원
        for(int j = 0 ; j < reserve.length ; j++){
            cnt_arr[reserve[j]] ++;
        };
        // 빌런 인원
        for(int j = 0 ; j < lost.length ; j++){
            cnt_arr[lost[j]] --;
        };

        for(int i = 1 ; i <= n ; i++){
            System.out.println(Arrays.toString(cnt_arr));
            
            if(cnt_arr[i] >= 2){
                if(cnt_arr[i-1] == 0){
                    cnt_arr[i]--;
                    cnt_arr[i-1]++;
                    continue;
                } else if(cnt_arr[i+1] == 0){
                    cnt_arr[i]--;
                    cnt_arr[i+1]++;
                    i++;
                    continue;
                }
            }
            
        }
        System.out.println();
        System.out.println(Arrays.toString(cnt_arr));
        
        for(int i = 1 ; i <= n ; i++){
            if(cnt_arr[i] == 0){
                answer++;
            }
        }
        return n - answer;
        
    }
}