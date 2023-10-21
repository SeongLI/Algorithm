class Solution {
    public int solution(int left, int right) {

        int result = 0;
        for(int i = left ; i <= right ; i++){
            if(func(i)) result += i;
            else result -= i;
        }
        return result;
        
    }
    
    public static boolean func(int num){
        int count = 0;
        
        for(int i = 1 ; i <= num ; i++){
            if(num % i == 0){
                count++;
            }
        }
        if(count % 2 == 0) return true;
        else return false;
    }
}