class Solution {
    public int solution(String[][] board, int h, int w) {
        String target = board[h][w];
        
        // 상하좌우
        int[] dr = { -1 , 1, 0 , 0};
        int[] dc = { 0, 0, -1, 1};
    
        int count = 0;
        for(int i = 0 ; i < 4 ; i++){
            int nr = h + dr[i];
            int nc = w + dc[i];
            if(nr < 0 || nc < 0 || nr >= board.length || nc >= board[0].length ) continue;
            if(board[nr][nc].equals(target)) count++;
        }
        return count;
    }
}