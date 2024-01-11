import java.util.*;
class Solution {
    public int solution(int[] elements) {
        // 두배 길이 배열 만들기
        int[] new_arr = new int[elements.length * 2];
        for(int i = 0 ; i < new_arr.length ; i++){
            new_arr[i] = elements[i % elements.length];
        }
        
         // 중복 방지
        HashMap<Integer,Integer> map = new HashMap<>();
        
        // 길이
        for(int i = 1 ; i <= elements.length ; i++){
           
            // 시작 인덱스
            for(int j = 0 ; j < elements.length ; j++){
                int sum = 0;
                for(int k = j ; k < j+i ; k++){
                    sum += new_arr[k];
                }
                map.put(sum, 1);
            }
        }
        return map.size();
            
    }
}