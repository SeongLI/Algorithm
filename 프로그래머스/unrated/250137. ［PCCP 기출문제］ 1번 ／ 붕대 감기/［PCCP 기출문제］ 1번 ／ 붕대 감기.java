import java.util.*;
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int cur_health = health; // 현재 체력
        int continue_band = 0; // 연속 체력회복
        int last_attack = attacks[attacks.length -1][0]; // 라스트타임
        
        for(int i = 0 ; i < attacks.length ; i++){
            map.put(attacks[i][0], attacks[i][1]);
        }
        
        for(int i = 1 ; i <= last_attack ; i++){ // 1초부터 시작
            
            // 맞을때
            if(map.containsKey(i)){
                cur_health -= map.get(i);
                continue_band = 0;
            }else{ // 안맞을때
                cur_health += bandage[1];
                continue_band ++;
                // 추가 회복
                if(bandage[0] == continue_band){
                    cur_health += bandage[2];
                    continue_band = 0;
                }
                // 체력을 넘어선다
                if(cur_health > health){
                    cur_health = health;
                }
            }
            
            // 체력이 0 이하면 죽은거
            if(cur_health <= 0) return -1;
            
        }
        return cur_health;
    
    }
}