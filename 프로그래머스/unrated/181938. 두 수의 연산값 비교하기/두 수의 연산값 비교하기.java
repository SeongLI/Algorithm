class Solution {
    public int solution(int a, int b) {
        String str = a + "" + b;
        int case_1 = Integer.parseInt(str);
        int case_2 = 2 * a * b;
        
        return case_1 > case_2 ? case_1 : case_2;
    }
}