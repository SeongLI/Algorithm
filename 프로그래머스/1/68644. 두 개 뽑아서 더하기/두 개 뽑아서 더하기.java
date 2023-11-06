import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0 ; i < numbers.length -1 ; i++){
            for(int j = i+1 ; j < numbers.length ; j++){
                if(!list.contains(numbers[i]+numbers[j])) {
                    list.add(numbers[i]+numbers[j]);
                    }
            }
        }
        int size = list.size();
        int[] ans = new int[size];
        for(int i = 0 ; i < size ; i++){
            ans[i] = list.remove(0);
        }
        Arrays.sort(ans);
        
        return ans;
    }
}