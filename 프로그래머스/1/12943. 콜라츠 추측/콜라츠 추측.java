class Solution {
    public int solution(double num) {
        int result = 0;
        
        while(result <= 500){
            System.out.println(result + " ???  + " + num);
            if(num == 1) return result;
            
            if(num % 2 == 0){
                num /= 2;
                result ++;
                continue;
            } else{
                num = num * 3 + 1;
                result ++;
                continue;
            }
        }
        return -1;
    }
}