class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        int N = common.length;
      
        if(common[N-1]-common[N-2] == common[N-2] - common[N-3]){  // 등차수열
               int temp = common[N-2] - common[N-3];
            return common[N-1] + temp;
        }else{ // 등비수열
              int temp = common[N-2] / common[N-3];
            return common[N-1] * temp;
        }
        
 
    }
}