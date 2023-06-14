import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] str_arr = s.split("");
        
         str_arr[0] = str_arr[0].toUpperCase();
        for(int i = 1 ; i < str_arr.length ; i++){
            str_arr[i] = str_arr[i].toLowerCase();
            
            if(str_arr[i-1].equals(" ") && !str_arr[i].equals(" ")){
                str_arr[i] = str_arr[i].toUpperCase();           
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < str_arr.length ; i++){
           sb.append(str_arr[i]); 
        }
        
        System.out.println(sb);
        
        answer = new String(sb);
        return answer;
    }
}