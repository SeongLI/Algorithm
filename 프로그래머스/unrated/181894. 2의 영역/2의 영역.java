import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int start = -1;
        int end = -1;
        for(int i = 0 ; i < arr.length -1 ; i++){
            if(arr[i] == 2) {
                start = i;
                break;
            }
        }
        
        for(int i = arr.length - 1 ; i > 0 ; i--){
            if(arr[i] == 2){
                end = i;
                break;
            }
        }
        if(start == -1 && end == -1) return new int[]{-1};
            
        int len = end - start + 1;
        int[] new_arr = new int[len];
        for(int i = 0 ; i < len ;i++){
            new_arr[i] = arr[start + i];
        }
        // System.out.println("start : " + start);
        // System.out.println("end : " + end);
        // System.out.println(Arrays.toString(arr));
        // System.out.println(Arrays.toString(new_arr));
        return new_arr;
    }
}