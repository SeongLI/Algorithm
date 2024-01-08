// s : 주어진 문자열
// skip : skip에 있는 알파베은 건너뜀
// index : s에 있는 알파벨을 index만큼 뒤로
// index만큼 뒤로 가다가, skip에 있는 알파벳이 있으면 한칸 뒤로
import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        int s_len = s.length();
        int skip_len = skip.length();
        // s를 character 배열로 쪼개서 넣기
        char[] s_arr = new char[s_len];
        for(int i = 0 ; i < s_len ; i++){
            s_arr[i] = s.charAt(i);
        }
        
        // skip을 list에 넣기 (contains 함수 활용)
        LinkedList<Character> list = new LinkedList<>();
        for(int i = 0 ; i < skip.length() ; i++){
            list.add(skip.charAt(i));
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i < s_arr.length ; i++){
            char temp_s = s_arr[i];
            for(int j = 0 ; j < index ; j++){
                temp_s += 1;
                if(temp_s > 'z') temp_s = 'a';
                while(list.contains(temp_s)){
                    temp_s += 1;
                    if(temp_s > 'z') temp_s = 'a';
                }
            }
            sb.append(temp_s);
        }
        return sb.toString();
        
    }
}