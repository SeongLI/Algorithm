class Solution {
    public String solution(String my_string, int num1, int num2) {
        String ch1 = String.valueOf(my_string.charAt(num1));
        String ch2 = String.valueOf(my_string.charAt(num2));
        
        String[] str_arr = my_string.split("");
            str_arr[num1] = ch2;
            str_arr[num2] = ch1;
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < str_arr.length ; i++){
            sb.append(str_arr[i]);
        }
        return sb.toString();
    }
}