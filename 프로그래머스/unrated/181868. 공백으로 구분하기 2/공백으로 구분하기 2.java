import java.util.*;
class Solution {
    public String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        int len = st.countTokens();
        String[] answer = new String[len];
        
        for(int i = 0 ; i < len ; i++){
            answer[i] = st.nextToken();
        }
        
        return answer;
        // 정규 표현식 
        // return my_string.trim().split("\\s+");
        // return my_string.trim().split("[ ]+");
    }
}