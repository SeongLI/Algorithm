class Solution {
    public int[] solution(int[] arr) {
       
        if( arr.length == 1) {
            int[] answer = {-1};
            return answer;
        };
        
        int min = 987654321;
        for(int i = 0 ; i < arr.length ; i++){
         if(arr[i] < min) min = arr[i];   
        }
        int[] answer = new int[arr.length-1];
        
        int x = 0;
        for(int i = 0 ; i < arr.length; i++){
           if(arr[i] == min) continue;
            
            answer[x] = arr[i];
            x ++;
        }
        
        
        return answer;
    }
}