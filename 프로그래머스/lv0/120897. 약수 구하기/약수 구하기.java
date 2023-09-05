import java.util.*;
class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1 ; i <= n ; i++ ){
            if(n % i == 0){
                list.add(i);
            }
        }
        
        int len = list.size();
        int[] result = new int[len];
        for(int i = 0 ; i < len ; i++){
            result[i] = list.remove(0);
        }
        return result;
    }
}