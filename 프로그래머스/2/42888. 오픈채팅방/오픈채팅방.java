import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        ArrayList<String[]> list = new ArrayList<>();
        HashMap<String, String> map = new HashMap<>();
        
        for(int i = 0 ; i < record.length ; i++){
            String[] temp_arr = record[i].split(" ");
            String cord = temp_arr[0];
            String id = temp_arr[1];
            
            if(cord.equals("Enter")){
                String nickname = temp_arr[2];
                map.put(id, nickname);
                list.add(new String[]{id, "님이 들어왔습니다."});
            } else if(cord.equals("Leave")){
                list.add(new String[]{id, "님이 나갔습니다."});
            } else{ // 변경(Change)
                String nickname = temp_arr[2];
                map.put(id, nickname);
            } 
        }
        
        String[] answer = new String[list.size()];

        for(int i = 0 ; i < answer.length ; i++){
            String[] temp = list.get(i);
            answer[i] = map.get(temp[0]) + temp[1];
        }
        return answer;
    }
}