class Solution {
    public static boolean visited[];
    public static int new_count;
    public int solution(int k, int[][] dungeons) {
        
        visited = new boolean[dungeons.length];
        new_count = 0;
        func( k , 0, dungeons);
        
        return new_count;
    }

    public static void func(int cur_k, int count, int[][] dungeons){
        
        // if(cur_k < 0) {
        //     if(new_count < count) new_count = count;
        //     return;
        // }
        new_count = Math.max(new_count, count);
        
        for(int i = 0 ; i < dungeons.length ; i++){
            if(!visited[i] && cur_k >= dungeons[i][0]){
                visited[i] = true;
                func(cur_k - dungeons[i][1], count + 1, dungeons);
                visited[i] = false;
            }
        }
        
    }
}