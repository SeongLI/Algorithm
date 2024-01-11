class Solution {
    public int[] solution(int brown, int yellow) {

        int sum = brown + yellow;
        
        for(int i = 3 ; i <= Math.sqrt(sum) ; i++){
            if(sum % i == 0){
                int temp = sum / i;
                int col = Math.max(i, temp);
                int row = Math.min(i, temp);
                if((col-2)*(row-2) == yellow){
                    return new int[]{col, row};
                }
                
            }
        }
        return new int[]{-1,-1};
    
    
    }
}