class Solution {
    public int solution(int n) {
        
        int before_count = func(n); // 1개수
        
        int answer = -1;
         while(true){
            n++;
            int after_count = func(n);
             
            if(before_count == after_count){
                answer = n;
                break;
            }
        }
        
        return answer;        
        
    }
    
        // 수(int) => 이진수(string) + 1개수 세버려
    public static int func(int number){
        int count = 0;
        while(number > 0){
            count += number % 2;
            number /= 2;
        }
        return count;
    }
    
    // // 수(int) => 이진수(string) < 시간초과 >
    // public static String func(int number){
    //     StringBuilder sb = new StringBuilder();
    //     while(number > 0){
    //         sb.append(number % 2);
    //         number /= 2;
    //     }
    //     return sb.reverse().toString();
    // }
    
}