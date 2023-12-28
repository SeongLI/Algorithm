import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        int arr_size = nums.length / 2 ;
        int map_size = map.size();
        
        if( arr_size > map_size ) return map_size;
        else return arr_size;
    }
}