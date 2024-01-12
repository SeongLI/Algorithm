import java.util.*;
class Solution {
    public int[] solution(int[] emergency) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] new_emer = new int[emergency.length];
    
        for(int i = 0 ; i < new_emer.length ; i++){
            new_emer[i] = emergency[new_emer.length - 1 -i];
        }
        
        Arrays.sort(new_emer);
        for(int i = 0 ; i < emergency.length ; i++){
            map.put(new_emer[i], emergency.length - i);
        }
        System.out.println(Arrays.toString(emergency));
        System.out.println(Arrays.toString(new_emer));
        
        int[] result = new int[new_emer.length];
        for(int i = 0 ; i < result.length ; i++){
            result[i] = map.get(emergency[i]);
        }
        
        return result;
    }
}