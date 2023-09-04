import java.util.*;
class Solution {
    public String solution(String my_string) {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < my_string.length() ; i++){
            char temp = my_string.charAt(i);
            if(temp >= 'a' && temp <= 'z'){
                sb.append((char)(temp - 'a' + 'A'));        
            } else{
                sb.append((char)(temp - 'A' + 'a'));
            }
        }
        return sb.toString();
    }
}