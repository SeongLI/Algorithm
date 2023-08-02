import java.util.*;
class Solution {
    public int solution(int[] array) {
        
        int len = array.length;
        int[] cnt_arr = new int[1000]; // 원소 범위 : 0부터 999까지
        for(int i = 0 ; i < len ; i++){
            cnt_arr[array[i]]++;
        }
        
        int max = 0;
        int index = 0;
        for(int i = 0 ; i <= 999 ; i++){
            if(max < cnt_arr[i]) {
                max = cnt_arr[i];
                index = i;
            }
        }
        
        int cnt = 0;
        for(int i = 0 ; i <= 999 ; i++){
            if(cnt_arr[index] == cnt_arr[i]) cnt++;
        }
        
        if(cnt >= 2){
            return -1;
        } else{
            return index;
        }
    }
}