class Solution {
    public String solution(String my_string, int s, int e) {
        String[] str_arr = my_string.split("");
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s ; i++){
            sb.append(str_arr[i]);
        }
        for(int i = e ; i >= s ; i--){
            sb.append(str_arr[i]);
        }

        if(str_arr.length >= e + 2){
            for(int i = e+1 ; i < str_arr.length ; i++){
                sb.append(str_arr[i]);
            }
        }
        return sb.toString();
    }
}