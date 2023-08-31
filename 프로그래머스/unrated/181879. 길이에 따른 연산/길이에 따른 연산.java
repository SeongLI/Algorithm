class Solution {
    public int solution(int[] num_list) {
        if(num_list.length >= 11){
            int result = 0;
            for(int i = 0 ; i < num_list.length ; i++){
                result += num_list[i]; 
            }
            return result;
        } else{
            int result = 1;
            for(int i = 0 ; i < num_list.length ; i++){
                result *= num_list[i];
            }
            return result;
        }
        
    }
}