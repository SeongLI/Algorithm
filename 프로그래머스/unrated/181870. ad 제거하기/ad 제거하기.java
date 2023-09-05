import java.util.*;
class Solution {
    public String[] solution(String[] strArr) {
        Queue<String> q = new LinkedList<>();
        for(int i = 0 ; i < strArr.length ; i++){
            if(!strArr[i].contains("ad")){
                q.add(strArr[i]);
            }
        }
        int len = q.size();
        String[] result = new String[len];
        for(int i = 0 ; i < len ; i ++){
            result[i] = q.poll();
        }
        return result;
    }
}