class Solution {
    public String solution(int n) {
        
        // 3으로 나눠 => 
        // 나머지 == 0 : 4를 붙여
        // 나머지 != 0 : 3으로 나눈 몫을 붙여
        // 뒤에서 부터 붙여야돼
        
        StringBuilder sb = new StringBuilder();
        
        while(n > 0){
            int rest = n % 3 ;
            
            n /= 3;

            if(rest == 0) {
                rest = 4;
                n--;
            }
            sb.append(rest);
        }
        
        return sb.reverse().toString();
    
    }
}