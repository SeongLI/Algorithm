// 배열길이가 10만 -> 이중 for문 지양
import java.util.*;
class Solution {
    public long solution(int[] weights) {
        Arrays.sort(weights);

        // weights 유닛, 중복개수
        HashMap<Double, Integer> map = new HashMap<>();
        
        long count = 0;
        for(double num : weights){
            
            double unit_1 = num * 1.0;
            double unit_2 = (num * 1.0) / 2.0;
            double unit_3 = (num * 2.0) / 3.0;
            double unit_4 = (num * 3.0) / 4.0;
            
            if(map.containsKey(unit_1)) count += map.get(unit_1);
            if(map.containsKey(unit_2)) count += map.get(unit_2);
            if(map.containsKey(unit_3)) count += map.get(unit_3);
            if(map.containsKey(unit_4)) count += map.get(unit_4);
            
            int temp = map.getOrDefault(num, 0);
            map.put(num, temp + 1);
        
        }
        return count;
        
    }
}