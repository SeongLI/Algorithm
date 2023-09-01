class Solution {
    public String solution(String my_string, String alp) {
        String[] str_arr = my_string.split("");
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < str_arr.length ; i++){
            if(str_arr[i].equals(alp)){
                str_arr[i] = str_arr[i].toUpperCase();
            }
            sb.append(str_arr[i]);
        }
        
        return sb.toString();
    }
}