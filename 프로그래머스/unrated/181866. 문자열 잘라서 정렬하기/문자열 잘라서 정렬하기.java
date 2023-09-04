import java.util.*;
class Solution {
    public String[] solution(String myString) {
        String[] str_arr = myString.split("x");
        ArrayList<String> list = new ArrayList<>();
        for(int i = 0 ; i < str_arr.length ; i++){
            if(!str_arr[i].isEmpty()) list.add(str_arr[i]);    
        }
        
        int len = list.size();
        String[] result = new String[len];
        for(int i = 0 ; i < len ; i++){
            result[i] = list.remove(0);
        }
        
        Arrays.sort(result);
        return result;
    }
}