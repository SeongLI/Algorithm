class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str_a = Integer.toString(a);
        String str_b = Integer.toString(b);
        
        String ans_a = str_a + str_b;
        String ans_b = str_b + str_a;
        
        return Integer.parseInt(ans_a) > Integer.parseInt(ans_b) 
            ? Integer.parseInt(ans_a) : Integer.parseInt(ans_b) ;
    }
}