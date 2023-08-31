class Solution {
    public int solution(String num_str) {
        int answer = 0;
        
        // int number = Integer.parseInt(num_str);
        // 런타임 에러
        // while(number > 0){
        //     answer += number % 10;
        //     number = number / 10;
        // }
        
        String[] str_Arr = num_str.split("");
        for(int i = 0 ; i < str_Arr.length ; i++){
            if(Integer.parseInt(str_Arr[i]) != 0){
                answer += Integer.parseInt(str_Arr[i]);
            }
        }
        
        
        return answer;
    }
}