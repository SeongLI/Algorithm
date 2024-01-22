class Solution {
    public int solution(int a, int b, int n) {
        int cnt = 0;
        
        // a : 받기위해 필요한 병 수
        // b : 가져다 주면 주는 병 수
        // n : 가지고 있는 병 수
        
        while(n >= a){
            
            int remain= n / a * b;
            
            cnt += remain ;
            n = ( n % a ) + remain ; 
        }
        
        return cnt;
    
    }
}