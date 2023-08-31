class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        int even = 0;
        int odd = 0;
        for(int i = 0 ; i < num_list.length ; i++){
            if(check(num_list[i])){
                even++;
            }else{
                odd++;
            }
        }
        answer[0] = even;
        answer[1] = odd;
        
        return answer;
    }
    
    public static boolean check(int num){
        // 짝수
        if(num % 2 == 0){
            return true;
        }
        // 홀수
        else{
            return false;
        }
    }
}