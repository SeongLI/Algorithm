import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int[] Person_1 = {1, 2, 3, 4, 5};
        int[] Person_2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] Person_3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] Total = new int[3];
        
        for(int i = 0 ; i < answers.length ; i++){
            if(answers[i] == Person_1[i % 5]) Total[0] ++;
            if(answers[i] == Person_2[i % 8]) Total[1] ++;
            if(answers[i] == Person_3[i % 10]) Total[2] ++;
        }
        
        int max = Math.max(Total[0], Math.max(Total[1], Total[2]));
        
        System.out.println(Arrays.toString(answers));
        System.out.println(max);
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i < Total.length; i++) {
            if(max == Total[i]) list.add(i+1);
        }
        
        System.out.println(list.size());
        
        int[] answer = new int[list.size()];
        for(int i=0; i < answer.length ; i++){
            answer[i] = list.get(i);
        }
        
        System.out.println(Arrays.toString(answer));

        return answer;
    }
}