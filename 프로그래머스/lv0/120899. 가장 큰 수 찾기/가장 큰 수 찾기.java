class Solution {
    public int[] solution(int[] array) {

        int max = 0;
        int max_index = 0;
        for(int i = 0 ; i < array.length ; i++){
            if(max < array[i]){
                max = array[i];
                max_index = i;
            }
        }
        int[] result = {max, max_index};
        
        return result;
    }
}