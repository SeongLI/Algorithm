class Solution {
    public String solution(String my_string, String letter) {
        
        char[] ch_arr = my_string.toCharArray();
        int len = ch_arr.length;
        char x = letter.charAt(0);
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < len ; i++){
            if(x != ch_arr[i]){
                sb.append(ch_arr[i]);
            }
        }
        return sb.toString();
    }
}