// 재귀를 돌린다.
// 중복을 확인한다.
// 개수를 출력한다.
import java.util.*;
class Solution {
    public static HashSet<Integer> set = new HashSet<>();
    public int solution(String numbers) {
        
        rec("", numbers); // 붙인것, 나머지
        
        int cnt = 0;
        for(int value : set){
            // System.out.println(value);
            if(isPrime(value)) cnt++;
        }
        
        return cnt;
    }
    
    public static void rec(String before, String numbers){
        if(!before.equals("")){
            int temp = Integer.parseInt(before);
            set.add(temp);
        }
        
        for(int i = 0 ; i < numbers.length() ; i++){
            rec(before + numbers.charAt(i), numbers.substring(0,i) + numbers.substring(i+1));
        }
    }
    
    public static boolean isPrime(int num){
        if(num <= 1) return false;
        
        for(int i = 2 ; i * i <= num ; i++){
            if(num % i == 0) return false;
        }
        return true;
    }
}