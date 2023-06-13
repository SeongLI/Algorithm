class Solution {
    public int solution(int n, int k) {
        int answer = 0;
        int temp = n / 10;
        k -= temp;
        answer = n*12000 + k*2000;
       
         
        return answer;
    }
}