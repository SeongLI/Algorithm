import java.util.*;
class Solution {
    public static boolean[] visited; 
    public static String answer;
    public static LinkedList<String> list = new LinkedList<>();;
    public String[] solution(String[][] tickets) {
        visited = new boolean[tickets.length];
        
        int count = 0;
        String Start = "ICN";
        String Link = "ICN";
        dfs(tickets, count, Start, Link);
        Collections.sort(list);
        
        return list.get(0).split(" ");
    } // solution
    
    public static void dfs(String[][] tickets, int count, String start, String Link){
        
        if(count == tickets.length) {
            list.add(Link);
            return;
        }
        
        for(int i = 0 ; i < tickets.length ; i++){
            if(!visited[i] && start.equals(tickets[i][0])){
                visited[i] = true;
                dfs(tickets, count+1, tickets[i][1], Link + " " + tickets[i][1]);
                visited[i] = false;
            }
        }
        
        
    } // dfs
}