import java.util.*;
class Solution {
    public int solution(String before, String after) {
       ArrayList<Character> list_1 = new ArrayList<>();
       ArrayList<Character> list_2 = new ArrayList<>();
        
       for(int i = 0 ; i < before.length() ; i++){
           list_1.add(before.charAt(i));
           list_2.add(after.charAt(i));
        } 
        
        Collections.sort(list_1);
        Collections.sort(list_2);
        
        if(list_1.equals(list_2)) return 1;
        else return 0;
        
    }
}