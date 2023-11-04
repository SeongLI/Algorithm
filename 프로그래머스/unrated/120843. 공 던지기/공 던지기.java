class Solution {
    public int solution(int[] numbers, int k) {
        // 1번 (index 0번) 부터 시작
        // 2칸을 건너서 반복
        // k번째 던지는 사람의 numbers[index];
       
//         if(k==1) return 1;
        
//         int tempIndex = 0;
//         for(int i = 0 ; i < k-1 ; i++){
//             tempIndex += 2;
//             tempIndex %= numbers.length;
            
//         }
//         return tempIndex + 1;
    
            // 기가막힌 방법
            return ((k-1) * 2 % numbers.length) + 1;
    }
}