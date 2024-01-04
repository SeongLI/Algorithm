class Solution {
    public String solution(String s) {
        String answer = "";
        String[] str_arr = s.split("");
        
        int index = 0;
        for(int i = 0 ; i < s.length() ; i++){
            if(str_arr[i].equals(" ")){ // 공백
                index = 0;
            }else if(index % 2 == 0){ // 짝수
                str_arr[i] = str_arr[i].toUpperCase();
                index++;
            } else if(index % 2 != 0){
                str_arr[i] = str_arr[i].toLowerCase();
                index++;
            }
            answer += str_arr[i];
        }
        return answer;
    
    }
}