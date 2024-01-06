class Solution {
    public int solution(int n, int m, int[] section) {
        // n : 벽의 길이
        // m : 한변에 칠할 수 있는 영역 길이
        boolean[] check = new boolean[n+1];
        int true_count = 0; // 칠해진 색 카운트
        int ans_count = 0; // 답
        for(int i = 0 ; i < section.length ; i++){
            int index = section[i];
            check[index] = true; // true는 아직 안칠한것
            true_count++;
        }
        
        for(int i = 1 ; i < check.length ; i++){
            if(check[i] == true){
                ans_count++;
                for(int j = 0 ; j < m ; j++){
                    if(i+j <= n ){
                        if(check[i+j] == true){
                            check[i+j] = false;
                            true_count--;
                        }
                    }
                }
            }
            if(true_count == 0) break;
        }
        
        return ans_count;
    }
}