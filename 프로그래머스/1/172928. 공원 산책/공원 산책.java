class Solution {
    public int[] solution(String[] park, String[] routes) {
        int row_len = park.length;
        int col_len = park[0].length();
        int row_point = 0;
        int col_point = 0;
        
        String[][] map = new String[row_len][col_len];
        for(int i = 0 ; i < row_len ; i++){
            String[] temp_arr = park[i].split("");
            for(int j = 0 ; j < col_len ; j++){
                map[i][j] = temp_arr[j];
                if(map[i][j].equals("S")){
                    row_point = i;
                    col_point = j;
                }
            }
        }
        System.out.println("start row point : " + row_point);
        System.out.println("start col point : " + col_point);
        
        loop : for(int i = 0 ; i < routes.length ; i++){
            int temp_row_point = row_point;
            int temp_col_point = col_point;
            String[] temp_route = routes[i].split(" ");
            String temp_dir = temp_route[0]; // 방향
            int temp_add = Integer.parseInt(temp_route[1]); // 거리
            
            for(int j = 0 ; j < temp_add ; j++){
                
            if(temp_dir.equals("E")){ // 동
                // temp_col_point += temp_add;
                temp_col_point ++;
            } else if(temp_dir.equals("W")){ // 서
                // temp_col_point -= temp_add;
                temp_col_point --;
            } else if(temp_dir.equals("S")){ // 남
                // temp_row_point += temp_add;
                temp_row_point ++;
            } else{ // 북
                temp_row_point --;
            }

            System.out.println(i + " temp row point : " + temp_row_point);
            System.out.println(i + " temp col point : " + temp_col_point);
            
            if(temp_col_point < 0 || temp_row_point < 0 || temp_col_point >= col_len || temp_row_point >= row_len) {
                temp_row_point = row_point;
                temp_col_point = col_point;
                continue loop;
            }
            if(map[temp_row_point][temp_col_point].equals("X")) {
                temp_row_point = row_point;
                temp_col_point = col_point;
                continue loop;
            }
            }
            
            row_point = temp_row_point;
            col_point = temp_col_point;
        }
        
        return new int[]{row_point, col_point};
    
    }
}