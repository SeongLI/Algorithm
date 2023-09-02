class Solution {
    public int[] solution(int n, int k) {
        int len = n / k;
        int[] result = new int[len];
        int num = k;
        for(int i = 0 ; i < len ; i++){
            result[i] = num;
            num += k;
        }
        return result;
    }
}