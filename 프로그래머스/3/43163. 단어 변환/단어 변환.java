class Solution {
    public static int ans, count;
    public static boolean[] visited;
    public int solution(String begin, String target, String[] words) {
        ans = Integer.MAX_VALUE;
        
        for(int i = 0 ; i < words.length ; i++){
            String temp = words[i];
            visited = new boolean[words.length];
            if(compare(begin, temp)){
                count++;
                visited[i] = true;
                dfs(1, temp, target, words);
            }
        }
        
        return ans == Integer.MAX_VALUE ? 0 : ans;
    
    } // solution
    
    public static void dfs(int count, String begin, String target, String[] words){
        if(begin.equals(target)){
            ans = Math.min(ans, count);
            return;
        }
        
        for(int i = 0 ; i < words.length ; i++){
            if(!visited[i] && compare(begin, words[i])){
                visited[i] = true;
                dfs(count+1, words[i], target, words);
                visited[i] = false;
            }
        }
        
    } // dfs
    
    
    // 한 개만 다르면 true
    public static boolean compare(String first, String second){
        int k = 0;
        for(int i = 0 ; i < first.length() ; i++){
            if(first.charAt(i) == second.charAt(i)) k++;
        }
        if( k == first.length() -1) return true;
        else return false;
    } // compare
}