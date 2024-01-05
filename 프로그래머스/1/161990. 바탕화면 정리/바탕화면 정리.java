class Solution {
    public int[] solution(String[] wallpaper) {
        // { 시작 row, 시작 col, 끝 row, 끝 col} 출력
        int row_len = wallpaper.length;
        int col_len = wallpaper[0].length();
        int min_row_index =1000;
        int min_col_index =1000;
        int max_row_index =-1;
        int max_col_index =-1;
        
        for(int i = 0 ; i < row_len ; i++){
            for(int j = 0 ; j < col_len ; j++){
                int temp_row_index = i;
                int temp_col_index = j;
                if(wallpaper[i].charAt(j) == '#'){
                   max_row_index = Math.max(max_row_index, temp_row_index); 
                   max_col_index = Math.max(max_col_index, temp_col_index); 
                   min_row_index = Math.min(min_row_index, temp_row_index); 
                   min_col_index = Math.min(min_col_index, temp_col_index); 
                    // 이랗게 하면 안돼에에ㅔ에에에
                   // if(temp_row_index > max_row_index) max_row_index = temp_row_index ; 
                   // if(temp_col_index > max_col_index) max_col_index = temp_col_index ; 
                   // if(temp_row_index < min_row_index) min_row_index = temp_row_index ; 
                   // if(temp_row_index < min_row_index) min_row_index = temp_row_index ; 
                }
            }
        }
        return new int[]{min_row_index, min_col_index, max_row_index+1, max_col_index+1};
    }
}