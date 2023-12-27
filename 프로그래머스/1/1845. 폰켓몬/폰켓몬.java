import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int result_len = nums.length / 2 ;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 1));
        }
        
        // int count = 0;
        // for(Integer index : map.keySet()){
        //     if(map.get(index) == 1) count ++;
        // }
        
        int count = map.size();
        if(count <= result_len) return count;
        else return result_len;
    }
}