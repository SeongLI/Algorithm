import java.util.*;
class Solution {
    public static char[][] new_map;
    public static boolean[][] visited;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};
    public static int row_len, col_len;
    public static int st_row, st_col, le_row, le_col, end_row, end_col = 0;
    public int solution(String[] maps) {
        row_len = maps.length;
        col_len = maps[0].length();
        
        new_map = new char[row_len][col_len];
        
        for(int i = 0 ; i < row_len ; i++){
            for(int j = 0 ; j < col_len ; j++){
                char unit = maps[i].charAt(j);
                new_map[i][j] = unit;
                if(unit == 'S'){
                    st_row = i;
                    st_col = j;
                }
                if(unit == 'L'){
                    le_row = i;
                    le_col = j;
                }
                if(unit == 'E'){
                    end_row = i;
                    end_col = j;
                }
            }
        }
        // 시작 -> 레버
        int first = bfs(st_row, st_col, le_row, le_col);
        // 레버 -> 끝
        int second = bfs(le_row, le_col, end_row, end_col);
    
        if(first == Integer.MAX_VALUE || second == Integer.MAX_VALUE) return -1;
        else return first + second;
    }
    
    public static int bfs(int start_row, int start_col, int end_row, int end_col){
        Queue<Integer> q_row = new LinkedList<>();
        Queue<Integer> q_col = new LinkedList<>();
        Queue<Integer> q_dis = new LinkedList<>();
        visited = new boolean[row_len][col_len];
        int cnt = Integer.MAX_VALUE;
        
        q_row.add(start_row);
        q_col.add(start_col);
        q_dis.add(0);
        visited[start_row][start_col] = true;
        
        while(!q_row.isEmpty()){
            int temp_row = q_row.poll();
            int temp_col = q_col.poll();
            int temp_dis = q_dis.poll();
            for(int dir = 0 ; dir < 4 ; dir++){
                int nr = temp_row + dr[dir];
                int nc = temp_col + dc[dir];
                
                if(nr < 0 || nc < 0 || nr >= row_len || nc >= col_len || visited[nr][nc]) continue;
                if(new_map[nr][nc] == 'X') continue;
                
                visited[nr][nc] = true;
                q_row.add(nr);
                q_col.add(nc);
                q_dis.add(temp_dis + 1);
                if(nr == end_row && nc == end_col){
                    if(temp_dis + 1 < cnt){
                        cnt = temp_dis + 1 ;
                    }
                }
            }
        }
        return cnt;
        
    }
    
}