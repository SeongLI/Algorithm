import java.util.*;
// pq는 get함수 없음.
class Solution {
    public int[] solution(int k, int[] score) {
        LinkedList<Integer> list = new LinkedList<>();
        int[] ans = new int[score.length];
        for(int i = 0 ; i < score.length ; i++){
            list.add(score[i]);
            Collections.sort(list);
            if(i < k){
                ans[i] = list.get(0);
            }else{
                int size = list.size();
                ans[i] = list.get(size - k);
            }
        }
        return ans;
        
    }
}