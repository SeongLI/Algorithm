// import java.util.*;

class Solution {
    int solution(int[][] land) {
        
        int row_len = land.length;
        int col_len = land[0].length;
        int[][] dp = new int[row_len][col_len];
        for(int i = 0 ; i < col_len ; i++){
            dp[0][i] = land[0][i];
        }
        
        for(int i = 1 ; i < row_len ; i++){
            for(int j = 0 ; j < col_len ; j++){ // 현재 행
                for(int k = 0 ; k < col_len ; k++){ // 이전 행
                    if(j != k){
                        dp[i][j] = Math.max(dp[i][j], land[i][j] + dp[i-1][k]); 
                    }
                }
            }
        }

        int max = 0;
        for(int i = 0 ; i < col_len ; i++){
            if(max < dp[row_len-1][i]) max = dp[row_len-1][i];
        }
        
        return max;
    }
}