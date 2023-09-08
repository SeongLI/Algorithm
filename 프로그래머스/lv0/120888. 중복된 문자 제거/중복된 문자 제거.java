class Solution {
    public String solution(String my_string) {
        
        StringBuilder sb = new StringBuilder();
        int len = my_string.length();
        for(int i = 0; i < len ; i++){
            String temp = String.valueOf(my_string.charAt(i));
            String temp_str = my_string.substring(0, i);
            
            if(!temp_str.contains(temp)) {
                sb.append(temp);
            }
        }
        return sb.toString();
    }
}