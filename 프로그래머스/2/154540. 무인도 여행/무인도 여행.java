import java.util.*;
class Solution {
    public static int row_len ;
    public static int col_len ;
    public static String[][] new_map;
    public static boolean[][] visited;
    public static int[] dr = {-1, 1, 0, 0};
    public static int[] dc = {0, 0, -1, 1};
    public static LinkedList<Integer> list = new LinkedList<>();

    public int[] solution(String[] maps) {
        row_len = maps.length;
        col_len = maps[0].length();
        
        new_map = new String[row_len][col_len];
        visited = new boolean[row_len][col_len];
        
        for(int i = 0 ; i < maps.length ; i++){
            
            String[] temp = maps[i].split("");
            for(int j = 0 ; j < temp.length ; j++){
                new_map[i][j] = temp[j];
            }
        }
        
        for(int i = 0 ; i < row_len ; i++){
            for(int j = 0 ; j < col_len ; j++){
                if(new_map[i][j].equals("X") || visited[i][j]) continue;
                int sum = bfs(i, j);
                list.add(sum);
            }
        }
        
        int size = list.size();
        if(size == 0) return new int[]{-1};
        int[] result = new int[size];
        for(int i = 0 ; i < size ; i++){
            result[i] = list.poll();
        }
        Arrays.sort(result);
        return result;
        

        
    } // solution 끝
    
    public static int bfs(int row, int col){
        Queue<Integer> q_row = new LinkedList<>();
        Queue<Integer> q_col = new LinkedList<>();
        
        q_row.add(row);
        q_col.add(col);
        int sum = Integer.parseInt(new_map[row][col]);
        visited[row][col] = true;
        
        while(!q_row.isEmpty()){
            int temp_row = q_row.poll();
            int temp_col = q_col.poll();
            
            for(int dir = 0 ; dir < 4 ; dir++){
                int nr = temp_row + dr[dir];
                int nc = temp_col + dc[dir];
                // 예외 처리
                if(nr < 0 || nc < 0 || nr >= row_len || nc >= col_len ) continue;
                if(new_map[nr][nc].equals("X") || visited[nr][nc]) continue;
            
                visited[nr][nc] = true;
                sum += Integer.parseInt(new_map[nr][nc]);
                
                q_row.add(nr);
                q_col.add(nc);
            }
        }
        
        return sum;
        
    }
    
}