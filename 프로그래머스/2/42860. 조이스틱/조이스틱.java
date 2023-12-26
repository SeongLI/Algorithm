import java.util.*;

class Solution {
    public int solution(String name) {
        int answer = 0;
        int name_len = name.length();
        int move_min = name_len - 1; // 이동횟수 초기화
        
        // 알파벳 이동(x) + 이동 경로 최소화
        for(int i = 0 ; i < name_len ; i++){
            int x = Math.min( name.charAt(i) - 'A' , 'Z' - name.charAt(i) + 1); // 첫 시작이 'A'
            answer += x; // 알파벳 변경에 필요한 최소 횟수
            
            // 현 위치에서 뒤로
            int next = i+1; // 다음 위치
            while(next < name_len && name.charAt(next) == 'A') next++;
            
            // i + name_len - next : 왼쪽으로 위치 확인
            move_min = Math.min( move_min, i + name_len - next + ( i ) );
            // i가 아니라 name_len - next 가 될 경우도 생각
            move_min = Math.min( move_min, i + name_len - next + (name_len - next) );
            
        }
        
        return answer + move_min;
    }
}