import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        // System.out.println(Arrays.toString(score));
        Arrays.sort(score);
        int point = score.length - 1 ;
        int sum = 0;
        // System.out.println(Arrays.toString(score));
        
  loop : while(true){
            int min = Integer.MAX_VALUE;
            for(int j = 0 ; j < m ; j++){
                // 최소값 관리
                if(min > score[point]) min = score[point];
                // 범위 관리
                if(j+1 == m){
                    sum += (min * m);
                }
                // 인덱스 관리
                point--;
                if(point < 0) break loop;
            }
            // System.out.println("min * m : " + (min * m));
        }
        return sum;
            
    }
}