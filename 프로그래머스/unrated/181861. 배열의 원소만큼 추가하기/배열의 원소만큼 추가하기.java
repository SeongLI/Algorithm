import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Queue<Integer> q = new LinkedList<>();
        int len = 0;
        for(int i = 0 ; i < arr.length ; i++){
            len += arr[i];
            for(int j = 0 ; j < arr[i] ; j++){
                q.add(arr[i]);
            }
        }
        int[] result = new int[len];
        for(int i = 0 ; i < len ; i++){
            result[i] = q.poll();
        }
        return result;
    }
}