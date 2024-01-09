class Solution {
    public int solution(int n) {
        // 연속이다. (제일 중요)
        int count = 1; // 자신
        
    loop : for(int i = 0 ; i < n / 2 ; i++){
                int sum = 0;
                for(int j = i+1 ; sum < n ; j++){
                    sum += j;
                    if(sum == n) {
                        count++;
                        continue loop;
                    }
                }
            }
        return count;
    
    }
}