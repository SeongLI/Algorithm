class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int num = i ; num <= j ; num++){
            String str_temp = num + "";
            for(int len = 0 ; len < str_temp.length() ; len++){
                String k_temp = k + "";
                if(k_temp.equals(str_temp.substring(len, len+1))) answer++;
            }
        }
        
        return answer;
    }
}