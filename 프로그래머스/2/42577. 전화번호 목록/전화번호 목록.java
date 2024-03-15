// 해시맵  풀이
// import java.util.*;
// class Solution {
//     public boolean solution(String[] phone_book) {
//         Arrays.sort(phone_book);
//         HashMap<String, Integer> map = new HashMap<>();
        
//         for(int i = 0 ; i < phone_book.length ; i++){
//             map.put(phone_book[i], i);
//         }
        
//         for(int i = 0 ; i < phone_book.length ; i++){
//             String temp = phone_book[i];
//             for(int j = 0 ; j < temp.length() ; j++){
//                 if(map.containsKey(temp.substring(0, j))) return false; // 0부터 j 전까지
//             }
//         }
        
//         return true;
//     }
// }

// 배열 풀이
import java.util.*;
class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        
        // 시간 초과!
        // for(int i = 0 ; i < phone_book.length ; i++){
        //     String temp = phone_book[i];
        //     for(int j = i+1 ; j < phone_book.length ; j++){
        //         if(phone_book[j].startsWith(temp)) return false;
        //     }
        // }
        
        for(int i = 0 ; i < phone_book.length-1 ; i++){
            if(phone_book[i+1].startsWith(phone_book[i])) return false;
        }
        return true;
    }
}
