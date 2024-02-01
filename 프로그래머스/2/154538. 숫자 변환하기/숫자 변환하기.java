class Solution {
    public int solution(int x, int y, int n) {
        int[] dp = new int[y+1];
        
        for(int index = x ; index <= y ; index++){
            // 처음 x만 0으로 시작, 이후에 0이면 Max값 넣어서 제외해버려~
            if(index != x && dp[index] == 0){
                dp[index] = Integer.MAX_VALUE;
                continue; // 돌아가~
            }
            
            if(index + n <= y){
                dp[index+n] = dp[index+n] == 0 ? dp[index] + 1 : Math.min(dp[index] + 1, dp[index+n]);
            }
            if(index * 2 <= y){
                dp[index*2] = dp[index*2] == 0 ? dp[index] + 1 : Math.min(dp[index] + 1, dp[index*2]);
            }
            if(index * 3 <= y){
                dp[index*3] = dp[index*3] == 0 ? dp[index] + 1 : Math.min(dp[index] + 1, dp[index*3]);
            }
            
        }
        
        if(dp[y] == Integer.MAX_VALUE) return -1;
        return dp[y];
    
    }
}