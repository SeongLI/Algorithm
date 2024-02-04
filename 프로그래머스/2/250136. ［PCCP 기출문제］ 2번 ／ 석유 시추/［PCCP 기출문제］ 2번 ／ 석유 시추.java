import java.util.*;
class Solution {
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};
    public static boolean[][] visited;
    public static int[][] new_land; // 새로운 땅
    public static Queue<Integer> q_row;
    public static Queue<Integer> q_col;
    public static int len_row;
    public static int len_col;
    public static HashMap<Integer, Integer> map = new HashMap<>();
    
    public int solution(int[][] land) {
        len_row = land.length;
        len_col = land[0].length;
        
        visited = new boolean[len_row][len_col];
        new_land = new int[len_row][len_col];
        int point = 10; // 구분자 역할
        for(int i = 0 ; i < len_row ; i++){
            for(int j = 0 ; j < len_col ; j++){
                if(land[i][j] == 0 || visited[i][j]) continue;
                bfs(i, j, point, land);
                point += 10;    
            }
        }
        
        // for(int i = 0 ; i < len_row ; i++){
        //     for(int j = 0 ; j < len_col ; j++){
        //         System.out.print(new_land[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        
        int max = -1;
        for(int col = 0 ; col < len_col ; col++){
            HashMap<Integer, Integer> second_map = new HashMap<>();
            for(int row = 0 ; row < len_row ; row++){
                if(new_land[row][col] != 0){
                    second_map.put(new_land[row][col], 1);
                }
            }
            int value = 0 ;
            for(int key : second_map.keySet()){
                value += map.get(key);
            }
            if(max < value) max = value;
        }
        
        return max;
    } // solution
    
    public static void bfs(int row, int col, int point, int[][] land){
        q_row = new LinkedList<>();
        q_col = new LinkedList<>();
        q_row.add(row);
        q_col.add(col);
        visited[row][col] = true;
        new_land[row][col] = point;
        
        int sum = 1; // 첫 시작은 1
        
        while(!q_row.isEmpty()){
            int temp_row = q_row.poll();
            int temp_col = q_col.poll();
            
            for(int dir = 0 ; dir < 4 ; dir++){
                int nr = temp_row + dr[dir];
                int nc = temp_col + dc[dir];
                
                if(nr < 0 || nc < 0 || nr >= len_row || nc >= len_col) continue;
                if(land[nr][nc] == 0 || visited[nr][nc]) continue;
                
                q_row.add(nr);
                q_col.add(nc);
                visited[nr][nc] = true;
                new_land[nr][nc] = point;
                sum++;
            }
        }
        map.put(point, sum);
    }
}