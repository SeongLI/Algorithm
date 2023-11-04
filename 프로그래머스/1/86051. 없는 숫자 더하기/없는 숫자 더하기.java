import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        
        boolean[] check = new boolean[10];
        
        for(int i = 0 ; i < numbers.length ; i++){
            check[numbers[i]] = true;
        }
        int sum = 0;
        for(int i = 0 ; i < check.length; i++){
            if(!check[i]) sum += i;
        }
        return sum;
        
    }
}