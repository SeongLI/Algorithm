class Solution {
    public int solution(String my_string) {
        int answer = 0;
        
        char[] ch_arr = my_string.toCharArray();
        for(int i = 0 ; i < ch_arr.length ; i++){
          if(Character.isDigit(ch_arr[i])){
              answer += (int) ch_arr[i];
              answer -= 48;
          }  
        }
        
        return answer;
    }
}