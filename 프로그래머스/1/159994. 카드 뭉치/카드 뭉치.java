import java.util.*;
class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int one_point = 0;
        int two_point = 0;
        for(int i = 0 ; i < goal.length ; i++){
            // System.out.println( i + " 번째 one_point " + one_point);
            // System.out.println( i + " 번째 two_point " + two_point);
            if(one_point < cards1.length){
                if(goal[i].equals(cards1[one_point])){
                    one_point++;
                    continue;
                }
            }
            if(two_point < cards2.length){
                if(goal[i].equals(cards2[two_point])){
                    two_point++;
                    continue;
                }
            }
             return "No";
            }
        return "Yes";
    }
}