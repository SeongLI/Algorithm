import java.util.*;
class Solution {
    public int solution(int number, int limit, int power) {
        
        // number번 돌려
        // 약수를 구하고
        // limit을 초과하면 power로 대체
        int sum = 0 ; // 누적 합
        
        for(int i = 1 ; i <= number ; i++){
            int num = prime(i, limit, power);
            if(num > limit){
                sum += power;
            } else{
                sum += num;
            }
        }
        return sum;
    
    }
    
    public static int prime(int num, int limit, int power){
        int count = 0;
        for(int i = 1 ; i <= Math.sqrt(num) ; i++){
            if(num % i == 0) {
                if(i*i == num) count++;
                else count += 2;
            }
        }
        return count;
        
    }
}