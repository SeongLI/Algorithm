import java.util.*;
class Solution {
    public String[] solution(String[] names) {
        Queue<String> q = new LinkedList<>();
        
        for(int i = 0 ; i < names.length ; i+=5){
            q.add(names[i]);
        }
        
        String[] answer = new String[q.size()];
        for(int i = 0 ; i < answer.length ; i++){
            answer[i] = q.poll();
        }
        
        return answer;
    }
}