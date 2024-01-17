import java.util.*;
class Solution {
    public String solution(String s) {
        LinkedList<Character> list = new LinkedList<>();
        
        for(int i = 0 ; i < s.length() ; i++){
            list.add(s.charAt(i));
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s.length() ; i++){
            sb.append(list.get(i));
        }
        
        return sb.toString();
        
    }
}