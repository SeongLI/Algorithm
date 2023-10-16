import java.util.Collections;
import java.util.ArrayList;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] % divisor == 0){
                list.add(arr[i]);
            }
        }
        
        if(list.isEmpty()) {
            list.add(-1);
        } else{
            Collections.sort(list);
        }
        
        int size = list.size();
        int[] result = new int[size];
        for(int i = 0; i < size ; i++){
            result[i] = list.remove(0);
        }
        return result;
        
    }
}