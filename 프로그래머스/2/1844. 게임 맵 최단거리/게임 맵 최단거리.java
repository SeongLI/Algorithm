import java.util.*;
class Solution {
    public static int[] dr = {-1,1,0,0};
    public static int[] dc = {0,0,-1,1};
    public static boolean[][] visited;
    public static int[][] new_map;
    public static Queue<Integer> q_row;
    public static Queue<Integer> q_col;
    public static boolean check;
    public int solution(int[][] maps) {
        
        visited = new boolean[maps.length][maps[0].length];
        new_map = new int[maps.length][maps[0].length];
        new_map[0][0] = 1;
        q_row = new LinkedList<>();
        q_col = new LinkedList<>();
        check = false;
        
        bfs(0, 0, maps);
    
        if(check) return new_map[maps.length - 1][maps[0].length -1];
        else return -1;
        
    } // solution 끝
    
    public static void bfs(int row, int col, int[][] maps){

        visited[row][col] = true;
        q_row.add(row);
        q_col.add(col);
        
        while(!q_row.isEmpty()){
            int temp_row = q_row.poll();
            int temp_col = q_col.poll();
            
            for(int dir = 0 ; dir < 4 ; dir ++){
                int nr = temp_row + dr[dir];
                int nc = temp_col + dc[dir];
                
                if(nr == maps.length -1 && nc == maps[0].length -1) {
                    check = true;
                }
                
                if( nr < 0 || nc < 0 || nr >= maps.length || nc >= maps[0].length) continue;
                if(visited[nr][nc] || maps[nr][nc] == 0) continue;
                
                new_map[nr][nc] = new_map[temp_row][temp_col] + 1;
                visited[nr][nc] = true;
                q_row.add(nr);
                q_col.add(nc);
                
            }                
        }// while 끝
        
    }
}