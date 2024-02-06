import java.util.*;
class Solution {
    public static int[][] map;
    public static boolean[] visited;
    public static int ans;
    public int solution(int n, int[][] wires) {
        
        ans = Integer.MAX_VALUE;
        map = new int[n+1][n+1];
        
        
        for(int i = 0 ; i < wires.length ; i++){
            int temp_1 = wires[i][0];
            int temp_2 = wires[i][1];
            map[temp_1][temp_2] = 1;
            map[temp_2][temp_1] = 1;
        }
        

        for(int i = 0 ; i < wires.length ; i++){
            int start = wires[i][0];
            int end = wires[i][1];
            
            // 끊기
            map[start][end] = 0;
            map[end][start] = 0;
        
            bfs(start, n);
            
            // 다시 붙이기
            map[start][end] = 1;
            map[end][start] = 1;
        }
        
        return ans;
        
    } // solution
    
    public static void bfs(int start, int n){
        Queue<Integer> q = new LinkedList<>();
        visited = new boolean[n+1];
        
        q.add(start);
        visited[start] = true;
        int count = 0;
        
        while(!q.isEmpty()){
            int temp = q.poll();
            count++;
            
            for(int next = 1 ; next <= n ; next++){
                if(visited[next] || map[temp][next]==0) continue;
                
                visited[next] = true;
                q.add(next);
            }
        }
        
        int result = Math.abs((n - count) - count) ;
        
        ans = Math.min(ans, result);
        
    }// bfs
}