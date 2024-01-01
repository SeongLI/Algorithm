import java.util.*;
class Solution {
    public int solution(int[] citations) {
        Arrays.sort(citations);
        // [0, 1, 3, 5, 6]
        // 0 0 => 5
        // 1 1 => 4
        // 2 3 => 3
        // 3 5 => 2
        // 4 6 => 1
        for(int i = 0 ; i < citations.length ; i++){
            int point = citations[i]; // 기준 포인트
            int h = citations.length - i; // point 이상 인용된 논문 개수
            if(point >= h) return h;
        }
        return 0;
    }
}   