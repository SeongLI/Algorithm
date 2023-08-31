class Solution {
    public int solution(int[] num_list) {
        int product = 1;
        int sum = 0;
        
        for(int i = 0 ; i < num_list.length ; i++){
            product *= num_list[i];
            sum += num_list[i];
        }
        
        if(product > sum*sum){
            return 0;
        } else{
            return 1;
        }
        
    }
}