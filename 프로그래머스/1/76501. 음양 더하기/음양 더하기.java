class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        int len = absolutes.length;
        
        int result = 0;
        for(int i = 0 ; i < len ; i++){
            if(signs[i]){
                result += absolutes[i];
            } else{
                result -= absolutes[i];
            }
        }
        return result;
    }
}