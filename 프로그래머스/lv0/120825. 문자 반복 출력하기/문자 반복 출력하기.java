class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        String[] str_arr = my_string.split("");
        for(int i = 0 ; i < str_arr.length ; i++){
           for(int j = 0 ; j < n ; j++){
               sb.append(str_arr[i]);
           }
        }
        
        System.out.print(sb);
        // answer = (String)sb; 안돼!
        answer = sb.toString();
        return answer;
    }
}