class Solution {
    public int solution(String s) {
        int point = 0;
        int x_count = 0;
        int extra_count = 0;
        int cnt = 0;
        char x = s.charAt(point);
        
        while(point < s.length()){
            if(x == s.charAt(point)){
                x_count++;
            }else{
                extra_count++;
            }
            
            if(x_count == extra_count){
                cnt++;
                point ++;
                if(point >= s.length()) {
                    cnt --;
                    break;
                    };
                x = s.charAt(point);
                continue;
            }
            point++;
        }
        return cnt + 1;
    }
}