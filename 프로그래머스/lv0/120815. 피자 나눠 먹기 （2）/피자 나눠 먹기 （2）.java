class Solution {
    public int solution(int n) {
        int answer = 1;
        
        while(true){
            int temp = 6 * answer;
            if(temp % n == 0){
                return answer;
            } else{
                answer++;
            }
            
        }
        
    }
}