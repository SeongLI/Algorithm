import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        for(int i = 0 ; i < sizes.length ; i++){
            Arrays.sort(sizes[i]);
        }
        
        int one = 0;
        int two = 0;
        for(int i = 0 ; i < sizes.length ; i++){
            if(one < sizes[i][0]) one = sizes[i][0];
            if(two < sizes[i][1]) two = sizes[i][1];
        }
        System.out.println(one);
        System.out.println(two);
        
        return one * two;
    }
}