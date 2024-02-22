import java.util.*;
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] new_arr = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            new_arr[i] = nums[i] * nums[i];
        }
        Arrays.sort(new_arr);
        return new_arr;
    }
}