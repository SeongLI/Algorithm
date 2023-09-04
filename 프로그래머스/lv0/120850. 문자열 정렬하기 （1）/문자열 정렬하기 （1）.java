import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        my_string = my_string.replaceAll("[a-z]", "");    
        int[] answer = new int[my_string.length()];
        for(int i = 0 ; i < my_string.length() ; i++){
            answer[i] = my_string.charAt(i)-48;
        }
        Arrays.sort(answer);
        return answer;
        
//         Queue<Integer> q = new LinkedList<>();
        
//         String[] str_arr = my_string.split("");
//         for(int i = 0 ; i < str_arr.length ; i++){
//             if(Character.isDigit(str_arr[i].charAt(0))){
//                 int temp = Integer.parseInt(str_arr[i]);
//                 q.add(temp);
//                 }
//             }
        
//         int len = q.size();
//         int[] answer = new int[len];
//         for(int i = 0 ; i < len ; i++){
//             answer[i] = q.poll();
//         }
//         Arrays.sort(answer);
//         return answer;
    }
}