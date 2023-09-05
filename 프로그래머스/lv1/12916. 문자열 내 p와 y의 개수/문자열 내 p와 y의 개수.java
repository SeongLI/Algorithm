class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int cnt = 0;
        String[] str_arr = s.split("");
        for(String x : str_arr){
            if(x.equals("p")) cnt++;
            else if(x.equals("y")) cnt--;
        }
        return cnt == 0 ? true : false;
    }
}