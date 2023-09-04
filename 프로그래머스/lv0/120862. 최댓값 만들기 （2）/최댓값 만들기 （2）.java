import java.util.*;
class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        Arrays.sort(numbers);
        
        int case_1 = numbers[0] * numbers[1];
        int case_2 = numbers[numbers.length-1] * numbers[numbers.length-2];
        return case_1 > case_2 ? case_1 : case_2;
    }
}