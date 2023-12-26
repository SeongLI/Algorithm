class Solution {
    public int solution(String[][] board, int h, int w) {
        int board_len = board.length;
        int count = 0;
        // 좌 상 하 우
        int[] dh = { 0 , 1 , -1 , 0 };
        int[] dw = { 1 , 0 , 0 , -1 }; 
        
        for(int i = 0 ; i < 4 ; i ++){
            int nh = h + dh[i];
            int nw = w + dw[i];
            if( nh < 0 || nh >= board_len || nw < 0 || nw >= board_len) continue;
            if(board[nh][nw].equals(board[h][w])) count++;
        }
        
        return count;
    }
}