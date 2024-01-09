class Solution {
    public String solution(String s, int n) {
        char[] ch_arr = new char[s.length()];
        for(int i = 0 ; i < s.length() ; i++){
            ch_arr[i] = s.charAt(i);
        }
        
        for(int i = 0 ; i < ch_arr.length ; i++){
            if(ch_arr[i] != ' '){
                if(ch_arr[i] <= 'Z'){ // 대문자 68
                    ch_arr[i] -= 'A';
                    ch_arr[i] = (char) ((ch_arr[i] + n) % 26);
                    ch_arr[i] += 'A';
                } else{ // 소문자
                    ch_arr[i] -= 'a';
                    ch_arr[i] = (char) ((ch_arr[i] + n) % 26);
                    ch_arr[i] += 'a';
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < ch_arr.length ; i++){
            sb.append(ch_arr[i]);
        }
        return sb.toString();
    }
}