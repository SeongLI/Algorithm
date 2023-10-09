class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        
        int index = 0;
            for(int row = 0 ; row < num_list.length/n ; row++){
                for(int col = 0 ; col < n ; col++){
                    answer[row][col] = num_list[index];
                    index++;
                }
            }
        
        return answer;
    }
}