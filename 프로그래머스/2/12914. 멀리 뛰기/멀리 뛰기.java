class Solution {
    public long solution(int n) {
        int[] dp = new int[2001];
        
        dp[1] = 1;
        dp[2] = 2; // 1칸+1칸 or 2칸
        // dp[3] = 3; 
        // dp[4] = 5;
        // dp[5] = 8;
        // 1 1 1 1 1 1
        // 1 1 1 1 2
        // 1 1 1 2 1
        // 1 1 2 1 1
        // 1 2 1 1 1
        // 2 1 1 1 1
        // 1 1 2 2
        // 1 2 1 2
        // 1 2 2 1
        // 2 1 1 2
        // 2 1 2 1
        // 2 2 1 1
        // 2 2 2
        for(int i = 3 ; i <= 2000 ; i++){
            dp[i] = (dp[i-2] + dp[i-1]) % 1234567;
        }
        return dp[n] ;
    }
}