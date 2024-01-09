class Solution {
    public int solution(String name) {
        int ans = 0;
        char[] ch_arr = new char[name.length()];
        
        int move_min = name.length()-1; // 최단거리 초기 셋팅
        
        for(int i = 0 ; i < name.length() ; i++){
            ch_arr[i] = name.charAt(i);
            
            ans += Math.min(('Z' - ch_arr[i]) + 1, (ch_arr[i] - 'A')); // 단어 맞추기
            
            int next = i+1;
            while(next < name.length() && (name.charAt(next) == 'A')) next++;
            
            // 총 길이
            move_min = Math.min( move_min, i*2 + name.length() - next ); // i + i : 갔다 돌아오는것
            move_min = Math.min( move_min, i + (name.length() - next)*2 );
        }
        ans += move_min;
        return ans;
    
    }
}