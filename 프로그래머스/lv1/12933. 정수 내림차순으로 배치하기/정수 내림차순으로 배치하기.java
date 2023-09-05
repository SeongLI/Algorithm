import java.util.*;
class Solution {
    public long solution(long n) {
        String str = "" + n;
        String[] str_arr = str.split("");
        
        Arrays.sort(str_arr);
        StringBuilder sb = new StringBuilder();
        for(String x : str_arr){
            sb.append(x);
        }
        sb.reverse();
        
        return Long.parseLong(sb.toString());
    }
}