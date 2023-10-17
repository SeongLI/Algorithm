class Solution {
    public int solution(int[] num_list) {
        int result = 0;
        for(int i = 0 ; i < num_list.length; i++){
            result += count(num_list[i]);
        }
        return result;
    }
    
    public static int count(int num){
        int cnt = 0;
        while(num != 1){
            if(num % 2 == 0){
                num = num / 2;
            }else{
                num = (num - 1) / 2;
            }
            cnt++;
        }
        return cnt;
    }
}