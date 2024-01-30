import java.util.*;
class Solution {
    public int solution(int[][] targets) {

        // for(int i = 0 ; i < targets.length ; i++){
        //     for(int j = 0 ; j < targets[0].length ; j++){
        //        System.out.print(targets[i][j] + " "); 
        //     }
        //     System.out.println();
        // }
        
        // 인덱스 1 기준 오름차순 정렬
        Arrays.sort(targets, (o1, o2) -> {
            if(o1[1] == o2[1]){
                return o1[0] - o2[0];
            }
            return o1[1] - o2[1];
        });
        
        int end = targets[0][1];
        int cnt = 1; // 마지막 +1
        for(int i = 1 ; i < targets.length ; i++){
            int temp_start = targets[i][0];
            int temp_end = targets[i][1];
            
            if(end <= temp_start){
                cnt ++;
                end = temp_end;
            }
        }
        
        // for(int i = 0 ; i < targets.length ; i++){
        //     for(int j = 0 ; j < targets[0].length ; j++){
        //        System.out.print(targets[i][j] + " "); 
        //     }
        //     System.out.println();
        // }
            
        return cnt;
    }
}