import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for(int i = 0 ; i < players.length ; i++){
            map.put(players[i], i);
        }
        
        for(int i = 0 ; i < callings.length ; i++){
            String back_player = callings[i];
            int back_index = map.get(back_player);
            int front_index = back_index - 1;
            String front_player = players[front_index];
        
            map.put(front_player, back_index);
            map.put(back_player, front_index);
            players[front_index] = back_player;
            players[back_index] = front_player;            
        }
        
    
        return players;
    
    }
}