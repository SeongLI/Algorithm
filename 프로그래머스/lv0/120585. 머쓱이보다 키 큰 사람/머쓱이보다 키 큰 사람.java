class Solution {
    public int solution(int[] array, int height) {
        int result = 0;
        int len = array.length;
        
        for(int i = 0 ; i < len ; i++){
            if(array[i] > height){
                result++;
            }
        }
            
        return result;
    }
}