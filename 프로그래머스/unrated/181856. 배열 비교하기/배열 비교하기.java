class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int len_1 = arr1.length;
        int len_2 = arr2.length;
        if(len_1 > len_2){
            return 1;
        } else if( len_1 < len_2){
            return -1;
        } else{
            int com = 0;
            for(int i = 0 ; i < len_1 ; i++){
                com += (arr1[i] - arr2[i]);
            }
            if(com > 0){
                return 1;
            } else if(com < 0){
                return -1;
            } else{
                return 0;
            }
        }
        
    }
}