// 한번에 최대 두명!!!
import java.util.*;
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int cnt = 0;
        int index = 0;
        for(int i = people.length-1 ; i - index >= 0 ; i--){
            int temp = people[i];
            if(temp + people[index] <= limit){
                cnt++;
                index++;
            } else {
                cnt++;
            }
        }
        return cnt;
    }
}