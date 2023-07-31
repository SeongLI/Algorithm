import java.util.*;
class Solution {
    public int solution(int n) {
        int answer = 0;
        
        double check = Math.sqrt(n);
        System.out.print(check);
        
        if(check % 1 == 0){
            return 1;
        } else return 2;
        
    }
}