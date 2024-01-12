import java.util.*;
class Solution {
    public static int left_point = 10;
    public static int right_point = 12;
    public String solution(int[] numbers, String hand) {
        
        // map 초기 셋팅
        int[][] map = new int[4][3];
        int index = 1;
        for(int i = 0 ; i < 4 ; i++){
            for(int j = 0 ; j < 3 ; j++){
                map[i][j] = index;
                index++;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < numbers.length ; i++){
            // System.out.println("left_point : " + left_point + "right_point : " + right_point);
            
            if(numbers[i] == 0) numbers[i] = 11; // 0 -> 11으로 변환
            
            if(numbers[i] % 3 == 1){
                left_point = numbers[i];
                sb.append("L");
            }else if(numbers[i] % 3 == 0){
                right_point = numbers[i];
                sb.append("R");
            }else{
                String str = dis_func( numbers[i], hand);
                sb.append(str);
            }
        }
        return sb.toString();
    }
    
    public static String dis_func( int number, String hand){
        // number와 가까운것을 찾아라.
        int left_point_row = (left_point-1) / 3;
        int left_point_col = (left_point-1) % 3;
        int right_point_row = (right_point-1) / 3;
        int right_point_col = (right_point-1) % 3;
        int number_row = (number-1) / 3;
        int number_col = (number-1) % 3;
        
        // 왼손과 거리
        int left_hand = Math.abs(left_point_row - number_row) + Math.abs(left_point_col - number_col);
        // 오른속과 거리
        int right_hand = Math.abs(right_point_row - number_row) + Math.abs(right_point_col - number_col);
        
        if(left_hand == right_hand){
            if(hand.equals("right")) {
                right_point = number;
                return "R";
            } else {
                left_point = number;
                return "L";
            }
        }else if(left_hand > right_hand) {
            right_point = number;
            return "R";
        }else {        
            left_point = number;
            return "L";
        }
    }
    
}