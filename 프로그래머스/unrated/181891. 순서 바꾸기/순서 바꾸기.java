import java.util.*;
class Solution {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = n ; i < num_list.length ; i++){
            list.add(num_list[i]);
        }
        
        for(int i = 0 ; i < n ; i++ ){
            list.add(num_list[i]);
        }
        
        System.out.print(list);
        int size = list.size();
        int[] answer = new int[size];
        for(int i = 0 ; i < size ; i++){
            answer[i] = list.remove(0);
        }
        
        return answer;
    }
}