class Solution {
    public int[] solution(int[] num_list) {
        int len = num_list.length;
        int x = num_list[len-2];
        int y = num_list[len-1];
            
        int[] answer = new int[len + 1];
        for(int i = 0 ; i < len ; i++){
            answer[i] = num_list[i];
        }
        if(x < y){
            answer[answer.length-1] = y-x;
        } else{
            answer[answer.length-1] = y*2;
        }
        
        return answer;
    }
}