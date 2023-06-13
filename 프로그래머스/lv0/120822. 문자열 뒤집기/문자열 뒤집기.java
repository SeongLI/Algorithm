class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        String answer = "";
        
        String[] str_arr = my_string.split("");
        
        for(int i = 0; i < str_arr.length ; i++){

            sb.append(str_arr[str_arr.length - i - 1]);
        }
        
        answer = new String(sb);
        return answer;
    }
}