import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        // 줄세워서 기준이 작은 경우에만
        // 길이 파악
        // subString
        
        Arrays.sort(phone_book);
           
        for(int i = 0 ; i < phone_book.length - 1; i++){
            if(phone_book[i+1].startsWith(phone_book[i])) return false;
        }
        
        return true;
    }
}