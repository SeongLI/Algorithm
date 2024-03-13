import java.util.*;
class Solution {
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};
    public static char[][] map;
    public static boolean[][] visited;
    public static int st_row, st_col = 0;
    public static int count = Integer.MAX_VALUE;
    
    public int solution(String[] board) {
        map = new char[board.length][board[0].length()];
        visited = new boolean[board.length][board[0].length()];

        // 맵 생성
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length() ; j++){
                char temp = board[i].charAt(j);
                map[i][j] = temp;
                if(temp == 'R'){
                    st_row = i;
                    st_col = j;
                }
            }
        }
        
        bfs(st_row, st_col);

        if(count == Integer.MAX_VALUE) return -1;
        else return count;
    }
    
    public static void bfs(int row, int col){
        Queue<Integer> q_row = new LinkedList<>();
        Queue<Integer> q_col = new LinkedList<>();
        Queue<Integer> q_cnt = new LinkedList<>();
        q_row.add(row);
        q_col.add(col);
        q_cnt.add(0);
        visited[row][col] = true;
        
        while(!q_row.isEmpty()){
            int temp_row = q_row.poll();
            int temp_col = q_col.poll();
            int temp_cnt = q_cnt.poll();
            
            if (map[temp_row][temp_col] == 'G'){
                if(temp_cnt < count){
                    count = temp_cnt;
                }
            }

            for(int dir = 0 ; dir < 4 ; dir++){
                int nr = temp_row + dr[dir];
                int nc = temp_col + dc[dir];

                while(isRange(nr,nc) && map[nr][nc] != 'D'){
                    nr += dr[dir];
                    nc += dc[dir];
                }
                
                // 직전 상태로 돌리기
                nr -= dr[dir];
                nc -= dc[dir];
                
                if(visited[nr][nc]) continue;
                    
                visited[nr][nc] = true;
                q_row.add(nr);
                q_col.add(nc);
                q_cnt.add(temp_cnt+1);
            }
        }
    } // bfs 끝
    
    public static boolean isRange(int row, int col){
        if(row < 0 || col < 0 || row >= map.length || col >= map[0].length) return false;
        else return true;
    } // isRange 끝
    
}