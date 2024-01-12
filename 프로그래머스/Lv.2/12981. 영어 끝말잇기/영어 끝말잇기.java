import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] result = new int[2];
        int len = words.length;
        LinkedList<String> list = new LinkedList<>();
        list.add(words[0]);
        
        for(int i = 1 ; i < len ; i++){
            char before = words[i-1].charAt(words[i-1].length()-1);
            char start = words[i].charAt(0);
        
            if(before != start || list.contains(words[i])){
                result[0] = i % n + 1 ;
                result[1] = i / n + 1;
                return result;
            }
            list.add(words[i]);
        }
        return result;
    }
}